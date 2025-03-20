package io.github.rajparsaniya.exception.utility;

public class FunctionalUtilityException extends UtilityException {
    public FunctionalUtilityException() {
    }

    public FunctionalUtilityException(final String message) {
        super(message);
    }

    public FunctionalUtilityException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public FunctionalUtilityException(final Throwable cause) {
        super(cause);
    }

    public FunctionalUtilityException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
