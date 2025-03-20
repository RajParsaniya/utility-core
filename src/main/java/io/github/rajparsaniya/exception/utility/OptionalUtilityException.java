package io.github.rajparsaniya.exception.utility;

public class OptionalUtilityException extends UtilityException {
    public OptionalUtilityException() {
    }

    public OptionalUtilityException(final String message) {
        super(message);
    }

    public OptionalUtilityException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public OptionalUtilityException(final Throwable cause) {
        super(cause);
    }

    public OptionalUtilityException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
