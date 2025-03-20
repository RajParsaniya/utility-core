package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IToDoubleFunction<T> {
    double applyAsDouble(final T value) throws Exception;
}
