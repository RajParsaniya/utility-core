package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IBiFunction<T, U, R> {
    R apply(final T t, final U u, final int index) throws Exception;
}
