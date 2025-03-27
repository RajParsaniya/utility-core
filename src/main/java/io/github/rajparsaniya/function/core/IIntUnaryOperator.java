package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IIntUnaryOperator {
    int applyAsInt(final int operand, final int index) throws Exception;
}
