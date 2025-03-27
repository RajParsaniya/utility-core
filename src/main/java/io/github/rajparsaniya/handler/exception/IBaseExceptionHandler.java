package io.github.rajparsaniya.handler.exception;

import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public interface IBaseExceptionHandler {
    void catchable(final Class<? extends Exception> exceptionClass);

    void catchable(final Set<Class<? extends Exception>> exceptionClasses);

    void throwable(final Supplier<? extends RuntimeException> exception);

    void throwable(final Function<Exception, ? extends RuntimeException> exception);
}
