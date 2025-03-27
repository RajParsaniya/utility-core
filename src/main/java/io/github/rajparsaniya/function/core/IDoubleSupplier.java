package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IDoubleSupplier {
    double getAsDouble(final int index) throws Exception;
}
