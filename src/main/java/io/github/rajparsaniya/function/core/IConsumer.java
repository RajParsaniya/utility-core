package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IConsumer<T> {
    void accept(final T t, final int index) throws Exception;
}
