package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents an operation upon two {@code long}-valued operands and producing a
 * {@code long}-valued result.   This is the primitive type specialization of
 * {@link IBinaryOperator} for {@code long}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsLong(long, long)}.
 *
 * @author Raj Parsaniya
 * @see IBinaryOperator
 * @see ILongUnaryOperator
 * @since 1.0.0
 */
@FunctionalInterface
public interface ILongBinaryOperator {

    /**
     * Applies this operator to the given operands.
     *
     * @param left  the first operand.
     * @param right the second operand.
     * @return the operator result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    long applyAsLong(final long left, final long right) throws Exception;
}
