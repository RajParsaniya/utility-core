package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IDoubleUnaryOperator {
    double applyAsDouble(final double operand) throws Exception;
}
