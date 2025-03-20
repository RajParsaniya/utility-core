package io.github.rajparsaniya.exception.handler;

public class UncaughtException extends RuntimeException {
    public UncaughtException() {
    }

    public UncaughtException(final String message) {
        super(message);
    }

    public UncaughtException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public UncaughtException(final Throwable cause) {
        super(cause);
    }

    public UncaughtException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
