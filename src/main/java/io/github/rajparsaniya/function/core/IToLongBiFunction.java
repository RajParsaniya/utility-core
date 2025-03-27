package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IToLongBiFunction<T, U> {
    long applyAsLong(final T t, final U u, final int index) throws Exception;
}
