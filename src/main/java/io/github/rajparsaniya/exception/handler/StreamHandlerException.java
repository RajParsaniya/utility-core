package io.github.rajparsaniya.exception.handler;

public class StreamHandlerException extends HandlerException {
    public StreamHandlerException() {
    }

    public StreamHandlerException(final String message) {
        super(message);
    }

    public StreamHandlerException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public StreamHandlerException(final Throwable cause) {
        super(cause);
    }

    public StreamHandlerException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
