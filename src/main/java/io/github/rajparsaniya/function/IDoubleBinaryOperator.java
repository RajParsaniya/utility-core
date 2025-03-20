package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IDoubleBinaryOperator {
    double applyAsDouble(final double left, final double right) throws Exception;
}
