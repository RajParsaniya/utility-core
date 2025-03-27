package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IObjLongConsumer<T> {
    void accept(final T t, final long value, final int index);
}
