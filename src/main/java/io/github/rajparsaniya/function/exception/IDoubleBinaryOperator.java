package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IDoubleBinaryOperator {
    double applyAsDouble(final double left, final double right) throws Exception;
}
