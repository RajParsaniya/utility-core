package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface ILongUnaryOperator {
    long applyAsLong(long operand, final int index);
}
