package io.github.rajparsaniya.function.functional.index;

/**
 * Represents an operation that accepts a single {@code double}-valued argument and
 * returns no result.  This is the primitive type specialization of
 * {@link IConsumer} for {@code double}.  Unlike most other functional interfaces,
 * {@code IDoubleConsumer} is expected to operate via side effects.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #accept(double, int)}.
 *
 * @author Raj Parsaniya
 * @see IConsumer
 * @since 1.0.0
 */
@FunctionalInterface
public interface IDoubleConsumer {

    /**
     * Performs this operation on the given argument.
     *
     * @param value the input argument.
     * @param index the index of the current element.
     * @since 1.0.0
     */
    void accept(final double value, final int index);
}
