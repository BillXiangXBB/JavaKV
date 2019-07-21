package com.xbb.javakv.kvstore;

import com.xbb.javakv.raft.node.RaftNode;

/**
 * KVStore启动类
 *
 * @author BillXiang
 * @version 1.0.0
 * @since 2017.07.21
 */
public class KVStoreBootstrap {

    private static RaftNode raftNode;

    public static void main(String[] args) {
        newRaftNode();
        raftNode.startNode();
    }

    private static void newRaftNode() {
        raftNode = new RaftNode();
    }

}
