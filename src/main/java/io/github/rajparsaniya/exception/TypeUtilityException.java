package io.github.rajparsaniya.exception;

public class TypeUtilityException extends UtilityException {
    public TypeUtilityException() {
    }

    public TypeUtilityException(String message) {
        super(message);
    }

    public TypeUtilityException(String message, Throwable cause) {
        super(message, cause);
    }

    public TypeUtilityException(Throwable cause) {
        super(cause);
    }

    public TypeUtilityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
