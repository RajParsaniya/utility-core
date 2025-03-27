package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IDoubleBinaryOperator {
    double applyAsDouble(final double left, final double right, final int index) throws Exception;
}
