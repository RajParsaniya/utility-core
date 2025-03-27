package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IToLongFunction<T> {
    long applyAsLong(final T value, final int index) throws Exception;
}
