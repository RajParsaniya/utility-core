package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code double}-valued result.  This is the primitive type specialization of
 * {@link IUnaryOperator} for {@code double}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsDouble(double)}.
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
     * @return the operator result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    double applyAsDouble(final double operand) throws Exception;
}
