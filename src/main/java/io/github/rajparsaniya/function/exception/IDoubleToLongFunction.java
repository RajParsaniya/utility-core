package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IDoubleToLongFunction {
    long applyAsLong(final double value) throws Exception;
}
