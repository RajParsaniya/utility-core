package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IFunction<T, R> {
    R apply(final T t) throws Exception;
}
