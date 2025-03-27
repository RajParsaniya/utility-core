package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IObjLongConsumer<T> {
    void accept(final T t, final long value) throws Exception;
}
