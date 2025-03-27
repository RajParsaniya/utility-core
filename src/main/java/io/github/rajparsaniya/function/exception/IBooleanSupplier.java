package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IBooleanSupplier {
    boolean getAsBoolean() throws Exception;
}
