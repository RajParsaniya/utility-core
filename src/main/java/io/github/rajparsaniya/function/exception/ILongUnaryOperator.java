package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface ILongUnaryOperator {
    long applyAsLong(long operand) throws Exception;
}
