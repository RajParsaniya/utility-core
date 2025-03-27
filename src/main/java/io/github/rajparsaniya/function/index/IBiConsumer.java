package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IBiConsumer<T, U> {
    void accept(final T t, final U u, final int index);
}
