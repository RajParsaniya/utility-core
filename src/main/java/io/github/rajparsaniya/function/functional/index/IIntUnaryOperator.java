package io.github.rajparsaniya.function.functional.index;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * an {@code int}-valued result.  This is the primitive type specialization of
 * {@link IUnaryOperator} for {@code int}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsInt(int, int)}.
 *
 * @author Raj Parsaniya
 * @see IUnaryOperator
 * @since 1.0.0
 */
@FunctionalInterface
public interface IIntUnaryOperator {

    /**
     * Applies this operator to the given operand.
     *
     * @param operand the operand.
     * @param index   the index of the current element.
     * @return the operator result.
     * @since 1.0.0
     */
    int applyAsInt(final int operand, final int index);
}
