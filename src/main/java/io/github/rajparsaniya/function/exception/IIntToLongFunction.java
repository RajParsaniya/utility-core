package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IIntToLongFunction {
    long applyAsLong(final int value) throws Exception;
}
