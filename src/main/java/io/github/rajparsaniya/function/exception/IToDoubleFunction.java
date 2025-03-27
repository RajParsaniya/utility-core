package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IToDoubleFunction<T> {
    double applyAsDouble(final T value) throws Exception;
}
