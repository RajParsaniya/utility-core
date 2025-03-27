package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IToLongFunction<T> {
    long applyAsLong(final T value) throws Exception;
}
