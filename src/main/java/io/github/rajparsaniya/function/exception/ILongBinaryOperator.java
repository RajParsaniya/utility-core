package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface ILongBinaryOperator {
    long applyAsLong(final long left, final long right) throws Exception;
}
