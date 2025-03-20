package io.github.rajparsaniya.function;

@FunctionalInterface
public interface ILongSupplier {
    long getAsLong() throws Exception;
}
