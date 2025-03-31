package io.github.rajparsaniya.handler.exception;

import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public interface IBaseExceptionHandler {
    void setCatchable(final Class<? extends Exception> exceptionClass);

    void setCatchable(final Set<Class<? extends Exception>> exceptionClasses);

    void setThrowable(final Supplier<? extends RuntimeException> exception);

    void setThrowable(final Function<Exception, ? extends RuntimeException> exception);
}
