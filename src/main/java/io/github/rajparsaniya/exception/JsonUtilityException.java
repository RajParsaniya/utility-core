package io.github.rajparsaniya.exception;

public class JsonUtilityException extends UtilityException {
    public JsonUtilityException() {
    }

    public JsonUtilityException(String message) {
        super(message);
    }

    public JsonUtilityException(String message, Throwable cause) {
        super(message, cause);
    }

    public JsonUtilityException(Throwable cause) {
        super(cause);
    }

    public JsonUtilityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
