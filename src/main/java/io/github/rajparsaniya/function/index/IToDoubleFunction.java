package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IToDoubleFunction<T> {
    double applyAsDouble(final T value, final int index);
}
