package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IConsumer<T> {
    void accept(final T t, final int index);
}
