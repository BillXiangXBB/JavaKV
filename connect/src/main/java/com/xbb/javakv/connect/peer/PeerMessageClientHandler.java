package com.xbb.javakv.connect.peer;

import com.xbb.javakv.common.exception.KVInvalidException;
import com.xbb.javakv.common.utils.LogsUtil;
import com.xbb.javakv.connect.peer.message.Message;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Raft客户端消息处理类
 *
 * @see io.netty.channel.ChannelInboundHandlerAdapter
 * @author BillXiang
 * @version 1.0.0
 * @since 2017.07.21
 */
public class PeerMessageClientHandler extends ChannelInboundHandlerAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PeerMessageClientHandler.class);

    private Message message;

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        ctx.write(message);
        ctx.flush();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws KVInvalidException {
        if (!(msg instanceof Message)) {
            throw new KVInvalidException("[PeerMessageClientHandler] the msg is not Message object.");
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        LOGGER.error(LogsUtil.exceptionStack(cause));
        ctx.close();
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
