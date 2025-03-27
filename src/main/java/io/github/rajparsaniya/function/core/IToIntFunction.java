package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IToIntFunction<T> {
    int applyAsInt(final T value, final int index) throws Exception;
}
