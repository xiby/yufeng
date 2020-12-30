package tech.xiby.yufeng.service;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.xiby.yufeng.config.RcsServerConfig;
import tech.xiby.yufeng.handler.NetworkHandler;

import javax.annotation.PostConstruct;


/**
 * network service implemented with Netty
 *
 * @author xiby
 * @date 2020/12/30
 */
@Service
public class NetworkService {
    private static Logger logger = LoggerFactory.getLogger(NetworkService.class);

    private Channel channel;

    private RcsServerConfig serverConfig;

    private NetworkHandler handler;

    @Autowired
    public NetworkService(RcsServerConfig config, NetworkHandler handler) {
        serverConfig = config;
        this.handler = handler;
    }

    @PostConstruct
    public void postInit() {
        logger.info("ip: " + serverConfig.getIp() + " port: " + serverConfig.getPort());
        Bootstrap bootstrap = new Bootstrap();
        NioEventLoopGroup group = new NioEventLoopGroup();

        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<io.netty.channel.Channel>() {
                    @Override
                    protected void initChannel(Channel ch) {
                        ch.pipeline().addLast(handler);
                    }
                });
        channel = bootstrap.connect(serverConfig.getIp(), serverConfig.getPort()).channel();
        try {
            channel.closeFuture().sync();
        } catch (InterruptedException e) {
            logger.error("error when establishing the link", e);
        }
    }

    /**
     * send a message to server
     *
     * @param msg message to send
     */
    public void sendMsg(String msg) {
        channel.writeAndFlush(msg);
    }
}
