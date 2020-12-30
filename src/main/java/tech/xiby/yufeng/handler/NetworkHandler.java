package tech.xiby.yufeng.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.xiby.yufeng.domain.MessageInfo;
import tech.xiby.yufeng.domain.WorldModel;
import tech.xiby.yufeng.parser.IParser;

/**
 * process the message received
 *
 * @author xiby
 */
@Component
public class NetworkHandler extends ChannelInboundHandlerAdapter {
    private static Logger logger = LoggerFactory.getLogger(NetworkHandler.class);

    private IParser parser;

    @Autowired
    public NetworkHandler(IParser parser){
        this.parser = parser;
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx){
        logger.info("connection active");
    }
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf byteBuf = (ByteBuf) msg;
        logger.info("receive message: " + byteBuf.toString(CharsetUtil.UTF_8));
        MessageInfo messageInfo = parser.parse(byteBuf);
        WorldModel worldModel = WorldModel.getInstance();
        worldModel.refresh(messageInfo);
    }
}
