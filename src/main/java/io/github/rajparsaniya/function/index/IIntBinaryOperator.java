package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IIntBinaryOperator {
    int applyAsInt(final int left, final int right, final int index);
}
