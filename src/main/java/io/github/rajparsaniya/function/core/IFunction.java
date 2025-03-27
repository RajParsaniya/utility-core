package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IFunction<T, R> {
    R apply(final T t, final int index) throws Exception;
}
