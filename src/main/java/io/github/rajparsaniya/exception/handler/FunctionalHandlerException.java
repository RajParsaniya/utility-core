package io.github.rajparsaniya.exception.handler;

public class FunctionalHandlerException extends HandlerException {
    public FunctionalHandlerException() {
    }

    public FunctionalHandlerException(final String message) {
        super(message);
    }

    public FunctionalHandlerException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public FunctionalHandlerException(final Throwable cause) {
        super(cause);
    }

    public FunctionalHandlerException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
