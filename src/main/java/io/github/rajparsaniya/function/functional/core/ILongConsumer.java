package io.github.rajparsaniya.function.functional.core;

/**
 * Represents an operation that accepts a single {@code long}-valued argument and
 * returns no result.  This is the primitive type specialization of
 * {@link IConsumer} for {@code long}.  Unlike most other functional interfaces,
 * {@code ILongConsumer} is expected to operate via side effects.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #accept(long, int)}.
 *
 * @author Raj Parsaniya
 * @see IConsumer
 * @since 1.0.0
 */
@FunctionalInterface
public interface ILongConsumer {

    /**
     * Performs this operation on the given argument.
     *
     * @param value the input argument.
     * @param index the index of the current element.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    void accept(final long value, final int index) throws Exception;
}
