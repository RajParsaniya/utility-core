package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IObjDoubleConsumer<T> {
    void accept(final T t, final double value) throws Exception;
}
