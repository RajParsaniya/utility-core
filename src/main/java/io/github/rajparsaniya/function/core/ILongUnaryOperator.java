package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface ILongUnaryOperator {
    long applyAsLong(long operand, final int index) throws Exception;
}
