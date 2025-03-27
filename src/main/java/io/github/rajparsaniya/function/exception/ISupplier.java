package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface ISupplier<T> {
    T get() throws Exception;
}
