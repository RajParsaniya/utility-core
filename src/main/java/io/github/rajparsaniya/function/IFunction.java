package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IFunction<T, R> {
    R apply(final T t) throws Exception;
}
