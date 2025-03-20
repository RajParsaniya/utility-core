package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IBooleanSupplier {
    boolean getAsBoolean() throws Exception;
}
