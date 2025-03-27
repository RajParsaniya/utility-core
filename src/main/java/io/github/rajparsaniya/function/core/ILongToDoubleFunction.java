package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface ILongToDoubleFunction {
    double applyAsDouble(final long value, final int index) throws Exception;
}
