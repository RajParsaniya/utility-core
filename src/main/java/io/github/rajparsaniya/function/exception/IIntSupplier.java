package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IIntSupplier {
    int getAsInt() throws Exception;
}
