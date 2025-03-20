package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IObjDoubleConsumer<T> {
    void accept(final T t, final double value) throws Exception;
}
