package io.github.rajparsaniya.function.functional.index;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code double}-valued result.  This is the primitive type specialization of
 * {@link IUnaryOperator} for {@code double}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsDouble(double, int)}.
 *
 * @author Raj Parsaniya
 * @see IUnaryOperator
 * @since 1.0.0
 */
@FunctionalInterface
public interface IDoubleUnaryOperator {

    /**
     * Applies this operator to the given operand.
     *
     * @param operand the operand.
     * @param index   the index of the current element.
     * @return the operator result.
     * @since 1.0.0
     */
    double applyAsDouble(final double operand, final int index);
}
