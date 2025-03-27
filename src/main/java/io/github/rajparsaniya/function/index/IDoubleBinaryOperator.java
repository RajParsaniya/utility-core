package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IDoubleBinaryOperator {
    double applyAsDouble(final double left, final double right, final int index);
}
