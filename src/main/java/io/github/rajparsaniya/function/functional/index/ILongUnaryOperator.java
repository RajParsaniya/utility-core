package io.github.rajparsaniya.function.functional.index;

/**
 * Represents an operation on a single {@code long}-valued operand that produces
 * a {@code long}-valued result.  This is the primitive type specialization of
 * {@link IUnaryOperator} for {@code long}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsLong(long, int)}.
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
     * @param index   the index of the current element.
     * @return the operator result.
     * @since 1.0.0
     */
    long applyAsLong(long operand, final int index);
}
