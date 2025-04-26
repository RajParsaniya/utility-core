package io.github.rajparsaniya.function.functional.index;

/**
 * Represents an operation that accepts an object-valued and a
 * {@code double}-valued argument, and returns no result.  This is the
 * {@code (reference, double)} specialization of {@link IBiConsumer}.
 * Unlike most other functional interfaces, {@code IObjDoubleConsumer} is
 * expected to operate via side effects.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #accept(Object, double, int)}.
 *
 * @param <T> the type of the object argument to the operation.
 * @author Raj Parsaniya
 * @see IBiConsumer
 * @since 1.0.0
 */
@FunctionalInterface
public interface IObjDoubleConsumer<T> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param t     the first input argument.
     * @param value the second input argument.
     * @param index the index of the current element.
     * @since 1.0.0
     */
    void accept(final T t, final double value, final int index);
}
