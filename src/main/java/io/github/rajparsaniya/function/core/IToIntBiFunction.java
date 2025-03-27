package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IToIntBiFunction<T, U> {
    int applyAsInt(final T t, final U u, final int index) throws Exception;
}
