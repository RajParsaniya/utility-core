package io.github.rajparsaniya.function;

@FunctionalInterface
public interface ISupplier<T> {
    T get() throws Exception;
}
