package io.github.rajparsaniya.handler.optional.exception.impl;

import io.github.rajparsaniya.exception.handler.HandlerException;
import io.github.rajparsaniya.exception.handler.UncaughtException;
import io.github.rajparsaniya.handler.optional.exception.IBaseExceptionHandler;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * The {@code BaseExceptionHandler} class provides an implementation of the
 * {@link IBaseExceptionHandler} interface.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class BaseExceptionHandler implements IBaseExceptionHandler {
    private final Set<Class<? extends Exception>> catchableExceptions = new HashSet<>();

    private Supplier<? extends RuntimeException> supplierException;
    private Function<Exception, ? extends RuntimeException> functionException;

    /**
     * Constructs a {@code BaseExceptionHandler} with a default behaviour.
     *
     * @since 1.0.0
     */
    protected BaseExceptionHandler() {
    }

    /**
     * Constructs a {@code BaseExceptionHandler} with a specified exception supplier.
     *
     * @param exception a {@link Supplier} providing a {@link RuntimeException} instance
     *                  when needed.
     * @since 1.0.0
     */
    protected BaseExceptionHandler(final Supplier<? extends RuntimeException> exception) {
        this.supplierException = exception;
    }

    /**
     * Constructs a {@code BaseExceptionHandler} with a specified exception function.
     *
     * @param exception a {@link Function} that takes an {@link Exception} and returns a
     *                  {@link RuntimeException} instance when needed.
     * @since 1.0.0
     */
    protected BaseExceptionHandler(final Function<Exception, ? extends RuntimeException> exception) {
        this.functionException = exception;
    }

    @Override
    public void setCatchable(final Class<? extends Exception> exceptionClass) {
        this.catchableExceptions.add(exceptionClass);
    }

    @Override
    public void setCatchable(final Set<Class<? extends Exception>> exceptionClasses) {
        this.catchableExceptions.addAll(exceptionClasses);
    }

    @Override
    public void setThrowable(final Supplier<? extends RuntimeException> exception) {
        this.supplierException = exception;
    }

    @Override
    public void setThrowable(final Function<Exception, ? extends RuntimeException> exception) {
        this.functionException = exception;
    }

    /**
     * Determines the appropriate exception supplier based on the provided exception.
     *
     * @param e the exception to be handled.
     * @return a {@link Supplier} that provides the appropriate {@link RuntimeException}
     * @throws HandlerException  if no custom exception supplier or function is available.
     * @throws UncaughtException if the exception is not in the catchable exceptions list.
     * @since 1.0.0
     */
    protected Supplier<? extends RuntimeException> exception(final Exception e) {
        final Function<Exception, HandlerException> handlerException = HandlerException::new;
        final Function<Exception, UncaughtException> uncaughtException = UncaughtException::new;
        final Supplier<? extends RuntimeException> exception = () -> Stream.of(
                Optional.ofNullable(this.supplierException).map(Supplier::get),
                Optional.ofNullable(this.functionException).map(function -> function.apply(e))
        ).filter(Optional::isPresent).map(Optional::get).findFirst().orElseThrow(() -> handlerException.apply(e));
        return Stream.concat(Stream.of(exception)
                .filter(predicate -> this.catchableExceptions.isEmpty()), this.catchableExceptions.stream()
                .filter(exceptionClass -> exceptionClass != null && exceptionClass.isInstance(e))
                .map(function -> exception)).findFirst().orElseThrow(() -> uncaughtException.apply(e));
    }
}
