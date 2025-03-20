package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IIntUnaryOperator {
    int applyAsInt(final int operand) throws Exception;
}
