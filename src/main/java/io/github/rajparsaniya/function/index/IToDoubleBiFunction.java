package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IToDoubleBiFunction<T, U> {
    double applyAsDouble(final T t, final U u, final int index);
}
