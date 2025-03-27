package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IObjIntConsumer<T> {
    void accept(final T t, final int value, final int index);
}
