package io.github.rajparsaniya.handler.functional.core.impl;

import io.github.rajparsaniya.exception.handler.HandlerException;
import io.github.rajparsaniya.exception.handler.UncaughtException;
import io.github.rajparsaniya.handler.functional.core.IBaseHandler;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * The {@code BaseHandler} class provides an implementation of the
 * {@link IBaseHandler} interface.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class BaseHandler implements IBaseHandler {
    private final Set<Class<? extends Exception>> catchableExceptions = new HashSet<>();

    private Supplier<? extends RuntimeException> supplierException;
    private Function<Exception, ? extends RuntimeException> functionException;

    private int initialIndex;

    /**
     * Constructs a {@code BaseHandler} with a default behaviour.
     *
     * @since 1.0.0
     */
    protected BaseHandler() {
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

    @Override
    public void setInitialIndex(final int initialIndex) {
        this.initialIndex = initialIndex;
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

    /**
     * Returns the initial index value.
     *
     * @return the initial index value.
     * @since 1.0.0
     */
    protected int initialIndex() {
        return this.initialIndex;
    }
}
