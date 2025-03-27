package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface ILongBinaryOperator {
    long applyAsLong(final long left, final long right, final int index) throws Exception;
}
