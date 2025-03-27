package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IDoubleToLongFunction {
    long applyAsLong(final double value, final int index) throws Exception;
}
