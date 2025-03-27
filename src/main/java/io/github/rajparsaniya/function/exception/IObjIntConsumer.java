package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IObjIntConsumer<T> {
    void accept(final T t, final int value) throws Exception;
}
