package io.github.rajparsaniya.exception.handler;

public class OptionalHandlerException extends HandlerException {
    public OptionalHandlerException() {
    }

    public OptionalHandlerException(final String message) {
        super(message);
    }

    public OptionalHandlerException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public OptionalHandlerException(final Throwable cause) {
        super(cause);
    }

    public OptionalHandlerException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
