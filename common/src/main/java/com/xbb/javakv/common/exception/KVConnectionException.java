package com.xbb.javakv.common.exception;

/**
 * 连接异常类
 *
 * @author BillXiang
 * @version 1.0.0
 * @since 2017.07.20
 */
public class KVConnectionException extends Exception {

    public KVConnectionException() {
        super();
    }

    public KVConnectionException(String message) {
        super(message);
    }

}
