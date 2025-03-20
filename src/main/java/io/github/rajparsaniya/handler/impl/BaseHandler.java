package io.github.rajparsaniya.handler.impl;

import io.github.rajparsaniya.exception.handler.HandlerException;
import io.github.rajparsaniya.exception.handler.UncaughtException;
import io.github.rajparsaniya.handler.IBaseHandler;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class BaseHandler implements IBaseHandler {
    private final Set<Class<? extends Exception>> catchableExceptions = new HashSet<>();

    private Supplier<? extends RuntimeException> supplierException;
    private Function<Exception, ? extends RuntimeException> functionException;

    protected BaseHandler() {
    }

    protected BaseHandler(final Supplier<? extends RuntimeException> exception) {
        this.supplierException = exception;
    }

    protected BaseHandler(final Function<Exception, ? extends RuntimeException> exception) {
        this.functionException = exception;
    }

    @Override
    public void catchable(final Class<? extends Exception> exceptionClass) {
        this.catchableExceptions.add(exceptionClass);
    }

    @Override
    public void catchable(final Set<Class<? extends Exception>> exceptionClasses) {
        this.catchableExceptions.addAll(exceptionClasses);
    }

    @Override
    public void throwable(final Supplier<? extends RuntimeException> exception) {
        this.supplierException = exception;
    }

    @Override
    public void throwable(final Function<Exception, ? extends RuntimeException> exception) {
        this.functionException = exception;
    }

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
