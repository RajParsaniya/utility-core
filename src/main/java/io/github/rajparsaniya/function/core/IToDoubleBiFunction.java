package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IToDoubleBiFunction<T, U> {
    double applyAsDouble(final T t, final U u, final int index) throws Exception;
}
