package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IDoubleToIntFunction {
    int applyAsInt(final double value, final int index) throws Exception;
}
