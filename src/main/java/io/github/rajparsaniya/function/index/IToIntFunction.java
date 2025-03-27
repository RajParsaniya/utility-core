package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IToIntFunction<T> {
    int applyAsInt(final T value, final int index);
}
