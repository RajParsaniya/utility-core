package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface ILongBinaryOperator {
    long applyAsLong(final long left, final long right, final int index);
}
