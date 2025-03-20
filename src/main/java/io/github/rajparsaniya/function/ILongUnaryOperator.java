package io.github.rajparsaniya.function;

@FunctionalInterface
public interface ILongUnaryOperator {
    long applyAsLong(long operand) throws Exception;
}
