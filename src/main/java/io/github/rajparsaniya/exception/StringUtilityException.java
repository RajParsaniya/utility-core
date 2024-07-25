package io.github.rajparsaniya.exception;

public class StringUtilityException extends UtilityException {
    public StringUtilityException() {

    }

    public StringUtilityException(String message) {
        super(message);
    }

    public StringUtilityException(String message, Throwable cause) {
        super(message, cause);
    }

    public StringUtilityException(Throwable cause) {
        super(cause);
    }

    public StringUtilityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
