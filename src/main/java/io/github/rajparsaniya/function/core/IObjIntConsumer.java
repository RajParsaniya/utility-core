package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IObjIntConsumer<T> {
    void accept(final T t, final int value, final int index) throws Exception;
}
