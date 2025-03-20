package io.github.rajparsaniya.exception.utility;

public class StreamUtilityException extends UtilityException {
    public StreamUtilityException() {
    }

    public StreamUtilityException(final String message) {
        super(message);
    }

    public StreamUtilityException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public StreamUtilityException(final Throwable cause) {
        super(cause);
    }

    public StreamUtilityException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
