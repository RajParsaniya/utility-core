package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IIntToLongFunction {
    long applyAsLong(final int value) throws Exception;
}
