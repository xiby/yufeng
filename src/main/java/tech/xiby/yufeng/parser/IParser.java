package tech.xiby.yufeng.parser;

import io.netty.buffer.ByteBuf;
import tech.xiby.yufeng.domain.MessageInfo;

/**
 * interface of the parser
 *
 * @author xiby
 */
public interface IParser {
    /**
     * parse the message
     *
     * @param byteBuf stream received from the server
     * @return message information
     */
    MessageInfo parse(ByteBuf byteBuf);
}
