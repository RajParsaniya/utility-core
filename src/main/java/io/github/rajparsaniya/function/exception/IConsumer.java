package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IConsumer<T> {
    void accept(final T t) throws Exception;
}
