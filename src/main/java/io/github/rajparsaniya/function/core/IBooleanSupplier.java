package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IBooleanSupplier {
    boolean getAsBoolean(final int index) throws Exception;
}
