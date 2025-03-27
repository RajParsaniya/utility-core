package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface ILongSupplier {
    long getAsLong(final int index) throws Exception;
}
