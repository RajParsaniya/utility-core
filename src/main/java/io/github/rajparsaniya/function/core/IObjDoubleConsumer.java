package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IObjDoubleConsumer<T> {
    void accept(final T t, final double value, final int index) throws Exception;
}
