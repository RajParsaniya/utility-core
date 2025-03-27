package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface ISupplier<T> {
    T get(final int index);
}
