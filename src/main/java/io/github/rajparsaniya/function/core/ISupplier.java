package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface ISupplier<T> {
    T get(final int index) throws Exception;
}
