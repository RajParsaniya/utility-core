package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IIntUnaryOperator {
    int applyAsInt(final int operand, final int index);
}
