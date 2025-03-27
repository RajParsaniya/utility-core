package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface ILongSupplier {
    long getAsLong(final int index);
}
