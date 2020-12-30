package tech.xiby.yufeng.parser;

import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Service;
import tech.xiby.yufeng.domain.MessageInfo;

/**
 * parse the message
 *
 * @author xiby
 */
@Service
public class MessageParser implements IParser{
    public MessageInfo parse(ByteBuf byteBuf) {
        return null;
    }
}
