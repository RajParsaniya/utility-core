package io.github.rajparsaniya.function.functional.core;

/**
 * Represents an operation upon two {@code int}-valued operands and producing an
 * {@code int}-valued result.   This is the primitive type specialization of
 * {@link IBinaryOperator} for {@code int}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsInt(int, int, int)}.
 *
 * @author Raj Parsaniya
 * @see IBinaryOperator
 * @see IIntUnaryOperator
 * @since 1.0.0
 */
@FunctionalInterface
public interface IIntBinaryOperator {

    /**
     * Applies this operator to the given operands.
     *
     * @param left  the first operand.
     * @param right the second operand.
     * @param index the index of the current element.
     * @return the operator result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    int applyAsInt(final int left, final int right, final int index) throws Exception;
}
