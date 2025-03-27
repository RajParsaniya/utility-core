package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IIntToLongFunction {
    long applyAsLong(final int value, final int index) throws Exception;
}
