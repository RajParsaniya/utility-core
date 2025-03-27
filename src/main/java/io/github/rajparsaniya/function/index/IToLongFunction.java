package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IToLongFunction<T> {
    long applyAsLong(final T value, final int index);
}
