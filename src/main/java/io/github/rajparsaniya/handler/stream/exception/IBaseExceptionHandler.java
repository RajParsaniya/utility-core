package io.github.rajparsaniya.handler.stream.exception;

import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * The {@code IBaseExceptionHandler} interface provides a mechanism for handling exceptions
 * in a structured and configurable manner. It allows specifying catchable exceptions,
 * defining custom throwable exceptions, and managing exception transformation logic.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public interface IBaseExceptionHandler {

    /**
     * Specifies a single {@link Exception} class that can be caught and handled by this handler.
     *
     * @param exceptionClass the {@link Exception} class to be catchable.
     * @since 1.0.0
     */
    void setCatchable(final Class<? extends Exception> exceptionClass);

    /**
     * Specifies multiple {@link Exception} classes that can be caught and handled by this handler.
     *
     * @param exceptionClasses a set of {@link Exception} classes to be catchable.
     * @since 1.0.0
     */
    void setCatchable(final Set<Class<? extends Exception>> exceptionClasses);

    /**
     * Defines a custom {@link RuntimeException} supplier that can be used to throw exception.
     *
     * @param exception the {@link RuntimeException} supplier to be throwable.
     * @since 1.0.0
     */
    void setThrowable(final Supplier<? extends RuntimeException> exception);

    /**
     * Defines a custom {@link RuntimeException} function that can be used to throw exception.
     *
     * @param exception the {@link RuntimeException} function to be throwable.
     * @since 1.0.0
     */
    void setThrowable(final Function<Exception, ? extends RuntimeException> exception);
}
