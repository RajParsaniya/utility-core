package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IDoubleUnaryOperator {
    double applyAsDouble(final double operand, final int index);
}
