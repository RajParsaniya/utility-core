package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IIntUnaryOperator {
    int applyAsInt(final int operand) throws Exception;
}
