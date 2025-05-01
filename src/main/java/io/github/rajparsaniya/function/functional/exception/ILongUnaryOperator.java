package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents an operation on a single {@code long}-valued operand that produces
 * a {@code long}-valued result.  This is the primitive type specialization of
 * {@link IUnaryOperator} for {@code long}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsLong(long)}.
 *
 * @author Raj Parsaniya
 * @see IUnaryOperator
 * @since 1.0.0
 */
@FunctionalInterface
public interface ILongUnaryOperator {

    /**
     * Applies this operator to the given operand.
     *
     * @param operand the operand.
     * @return the operator result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    long applyAsLong(long operand) throws Exception;
}
