package tech.xiby.yufeng.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * process the message received
 *
 * @author xiby
 */
public class NetworkHandler extends ChannelInboundHandlerAdapter {
    private static Logger logger = LoggerFactory.getLogger(NetworkHandler.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx){
        logger.info("connection active");
    }
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf byteBuf = (ByteBuf) msg;
        logger.info("receive message: " + byteBuf.toString(CharsetUtil.UTF_8));
    }
}
