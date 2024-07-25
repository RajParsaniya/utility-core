package io.github.rajparsaniya.exception;

public class DateUtilityException extends UtilityException {
    public DateUtilityException() {
    }

    public DateUtilityException(String message) {
        super(message);
    }

    public DateUtilityException(String message, Throwable cause) {
        super(message, cause);
    }

    public DateUtilityException(Throwable cause) {
        super(cause);
    }

    public DateUtilityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
