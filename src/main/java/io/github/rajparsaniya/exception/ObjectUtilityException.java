package io.github.rajparsaniya.exception;

public class ObjectUtilityException extends UtilityException {
    public ObjectUtilityException() {
    }

    public ObjectUtilityException(String message) {
        super(message);
    }

    public ObjectUtilityException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectUtilityException(Throwable cause) {
        super(cause);
    }

    public ObjectUtilityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
