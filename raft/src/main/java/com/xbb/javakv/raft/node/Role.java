package com.xbb.javakv.raft.node;

/**
 * 节点当前在集群中的角色
 * Raft算法中，节点在运行过程中可能出现以下三种状态：
 *     1. Follower
 *     2. Candidate
 *     3. Leader
 *
 * @author BillXiang
 * @version 1.0.0
 * @since 2017.07.14
 */
public enum Role {

    /** Follower */
    FOLLOWER("Follower"),
    /** Candidate */
    CANDIDATE("Candiate"),
    /** Leader */
    LEADER("Leader");

    Role(String value) {
        this.value = value;
    }

    private String value;

    public String value() {
        return this.value;
    }

}
