package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IDoubleToLongFunction {
    long applyAsLong(final double value) throws Exception;
}
