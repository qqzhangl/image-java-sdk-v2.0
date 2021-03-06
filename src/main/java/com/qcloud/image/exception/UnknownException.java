package com.qcloud.image.exception;

// 未知异常
public class UnknownException extends AbstractImageException {

    private static final long serialVersionUID = 4303770859616883146L;

    public UnknownException(String message, Throwable cause) {
        super(message, cause, ImageExceptionType.UNKNOWN_EXCEPTION);
    }

    public UnknownException(Throwable cause) {
        super(ImageExceptionType.UNKNOWN_EXCEPTION, cause);
    }
}
