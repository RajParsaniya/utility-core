package io.github.rajparsaniya.exception.handler;

import io.github.rajparsaniya.handler.stream.exception.IStreamExceptionHandler;

import java.io.Serial;

/**
 * {@code StreamHandlerException} is a subclass of {@link HandlerException}
 * that may be thrown in classes implementing {@link IStreamExceptionHandler}.
 *
 * <p>{@code StreamHandlerException} is thrown when a {@link IStreamExceptionHandler}
 * implemented class does not have a specified throwable exception.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class StreamHandlerException extends HandlerException {
    @Serial
    private static final long serialVersionUID = -4487943849985975771L;

    /**
     * Constructs a {@code StreamHandlerException} with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     *
     * @since 1.0.0
     */
    public StreamHandlerException() {
    }

    /**
     * Constructs a {@code StreamHandlerException} with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     * @since 1.0.0
     */
    public StreamHandlerException(final String message) {
        super(message);
    }

    /**
     * Constructs a {@code StreamHandlerException} with the specified detail message and
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
    public StreamHandlerException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a {@code StreamHandlerException} with the specified cause and a
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
    public StreamHandlerException(final Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a {@code StreamHandlerException} with the specified detail
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
    public StreamHandlerException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
