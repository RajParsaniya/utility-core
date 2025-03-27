package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IDoubleSupplier {
    double getAsDouble() throws Exception;
}
