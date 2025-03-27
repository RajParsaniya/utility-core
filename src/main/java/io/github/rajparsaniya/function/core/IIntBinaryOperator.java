package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IIntBinaryOperator {
    int applyAsInt(final int left, final int right, final int index) throws Exception;
}
