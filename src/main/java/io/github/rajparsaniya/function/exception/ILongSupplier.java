package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface ILongSupplier {
    long getAsLong() throws Exception;
}
