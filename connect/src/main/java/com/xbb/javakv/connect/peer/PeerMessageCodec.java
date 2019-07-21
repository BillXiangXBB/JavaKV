package com.xbb.javakv.connect.peer;

import com.google.protobuf.InvalidProtocolBufferException;
import com.xbb.javakv.common.exception.KVInvalidException;
import com.xbb.javakv.connect.peer.message.Message;

/**
 * Raft消息编解码类
 *
 * @author BillXiang
 * @version 1.0.0
 * @since 2019.07.20
 */
public class PeerMessageCodec {

    public byte[] encode(Message message) {
        return message.toByteArray();
    }

    public Message decode(byte[] messages) throws KVInvalidException {
        try {
            return Message.parseFrom(messages);
        } catch (InvalidProtocolBufferException e) {
            throw new KVInvalidException("[PeerMessageCodec] Can't decode the data to Message object: "
                    + e.getMessage());
        }
    }

}
