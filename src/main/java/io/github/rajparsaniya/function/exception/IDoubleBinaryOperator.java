package io.github.rajparsaniya.function.exception;

/**
 * Represents an operation upon two {@code double}-valued operands and producing a
 * {@code double}-valued result.   This is the primitive type specialization of
 * {@link IBinaryOperator} for {@code double}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsDouble(double, double)}.
 *
 * @author Raj Parsaniya
 * @see IBinaryOperator
 * @see IDoubleUnaryOperator
 * @since 1.0.0
 */
@FunctionalInterface
public interface IDoubleBinaryOperator {

    /**
     * Applies this operator to the given operands.
     *
     * @param left  the first operand.
     * @param right the second operand.
     * @return the operator result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    double applyAsDouble(final double left, final double right) throws Exception;
}
