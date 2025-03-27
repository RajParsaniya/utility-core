package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IIntSupplier {
    int getAsInt(final int index) throws Exception;
}
