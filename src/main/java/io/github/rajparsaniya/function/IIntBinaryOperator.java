package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IIntBinaryOperator {
    int applyAsInt(final int left, final int right) throws Exception;
}
