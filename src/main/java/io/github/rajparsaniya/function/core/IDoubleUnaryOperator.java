package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IDoubleUnaryOperator {
    double applyAsDouble(final double operand, final int index) throws Exception;
}
