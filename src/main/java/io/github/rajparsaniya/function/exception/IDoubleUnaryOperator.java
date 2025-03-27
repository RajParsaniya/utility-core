package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IDoubleUnaryOperator {
    double applyAsDouble(final double operand) throws Exception;
}
