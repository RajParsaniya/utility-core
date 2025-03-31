package io.github.rajparsaniya.exception.handler;

import io.github.rajparsaniya.handler.exception.IOptionalExceptionHandler;

import java.io.Serial;

/**
 * {@code OptionalHandlerException} is a subclass of {@link HandlerException}
 * that may be thrown in classes implementing {@link IOptionalExceptionHandler}.
 *
 * <p>{@code OptionalHandlerException} is thrown when a {@link IOptionalExceptionHandler}
 * implemented class does not have a specified throwable exception.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class OptionalHandlerException extends HandlerException {
    @Serial
    private static final long serialVersionUID = -3552996078660790401L;

    /**
     * Constructs a {@code OptionalHandlerException} with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     *
     * @since 1.0.0
     */
    public OptionalHandlerException() {
    }

    /**
     * Constructs a {@code OptionalHandlerException} with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     * @since 1.0.0
     */
    public OptionalHandlerException(final String message) {
        super(message);
    }

    /**
     * Constructs a {@code OptionalHandlerException} with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this runtime exception's detail message.
     *
     * @param message the detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method).
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A {@code null} value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     * @since 1.0.0
     */
    public OptionalHandlerException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a {@code OptionalHandlerException} with the specified cause and a
     * detail message of {@code (cause==null ? null : cause.toString())}
     * (which typically contains the class and detail message of
     * {@code cause}).  This constructor is useful for runtime exceptions
     * that are little more than wrappers for other throwable.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     * @since 1.0.0
     */
    public OptionalHandlerException(final Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a {@code OptionalHandlerException} with the specified detail
     * message, cause, suppression enabled or disabled, and writable
     * stack trace enabled or disabled.
     *
     * @param message            the detail message.
     * @param cause              the cause.  (A {@code null} value is permitted,
     *                           and indicates that the cause is nonexistent or unknown.)
     * @param enableSuppression  whether suppression is enabled
     *                           or disabled
     * @param writableStackTrace whether the stack trace should
     *                           be writable
     * @since 1.0.0
     */
    public OptionalHandlerException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
