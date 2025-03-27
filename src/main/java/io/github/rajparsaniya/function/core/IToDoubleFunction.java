package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IToDoubleFunction<T> {
    double applyAsDouble(final T value, final int index) throws Exception;
}
