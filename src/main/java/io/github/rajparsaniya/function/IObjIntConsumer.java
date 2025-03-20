package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IObjIntConsumer<T> {
    void accept(final T t, final int value) throws Exception;
}
