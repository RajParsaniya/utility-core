package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IToDoubleBiFunction<T, U> {
    double applyAsDouble(final T t, final U u) throws Exception;
}
