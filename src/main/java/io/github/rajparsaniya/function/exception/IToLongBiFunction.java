package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IToLongBiFunction<T, U> {
    long applyAsLong(final T t, final U u) throws Exception;
}
