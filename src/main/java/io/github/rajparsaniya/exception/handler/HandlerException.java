package io.github.rajparsaniya.exception.handler;

public class HandlerException extends RuntimeException {
    public HandlerException() {
    }

    public HandlerException(final String message) {
        super(message);
    }

    public HandlerException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public HandlerException(final Throwable cause) {
        super(cause);
    }

    public HandlerException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
