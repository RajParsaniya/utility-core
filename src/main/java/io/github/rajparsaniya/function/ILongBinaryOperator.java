package io.github.rajparsaniya.function;

@FunctionalInterface
public interface ILongBinaryOperator {
    long applyAsLong(final long left, final long right) throws Exception;
}
