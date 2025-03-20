package io.github.rajparsaniya.exception.utility;

public class UtilityException extends RuntimeException {
    public UtilityException() {
    }

    public UtilityException(final String message) {
        super(message);
    }

    public UtilityException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public UtilityException(final Throwable cause) {
        super(cause);
    }

    public UtilityException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
