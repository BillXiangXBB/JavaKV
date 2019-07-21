package com.xbb.javakv.common.utils;

/**
 * 日志打印工具类
 *
 * @author BillXiang
 * @version 1.0.0
 * @since 2017.07.20
 */
public class LogsUtil {

    /**
     * 打印异常堆栈
     *
     * @param e 异常
     * @return 堆栈
     */
    public static String exceptionStack(Throwable e) {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Occur Throwable: ").append(e.getClass().getName())
                .append(": ").append(e.getMessage()).append("\n");
        exceptionStackTraces(e, strBuilder);
        return strBuilder.toString();
    }

    private static void exceptionStackTraces(Throwable e, StringBuilder strBuilder) {
        for (StackTraceElement element: e.getStackTrace()) {
            strBuilder.append("\t").append("at ").append(element.toString()).append("\n");
        }
        if (e.getCause() != null) {
            strBuilder.append("Caused by:").append("\n");
            exceptionStackTraces(e.getCause(), strBuilder);
        }
    }

}
