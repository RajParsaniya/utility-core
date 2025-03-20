package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IToLongFunction<T> {
    long applyAsLong(final T value) throws Exception;
}
