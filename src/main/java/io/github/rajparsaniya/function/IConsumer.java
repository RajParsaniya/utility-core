package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IConsumer<T> {
    void accept(final T t) throws Exception;
}
