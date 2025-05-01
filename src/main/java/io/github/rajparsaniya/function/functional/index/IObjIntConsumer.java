package io.github.rajparsaniya.function.functional.index;

/**
 * Represents an operation that accepts an object-valued and a
 * {@code int}-valued argument, and returns no result.  This is the
 * {@code (reference, int)} specialization of {@link IBiConsumer}.
 * Unlike most other functional interfaces, {@code IObjIntConsumer} is
 * expected to operate via side effects.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #accept(Object, int, int)}.
 *
 * @param <T> the type of the object argument to the operation.
 * @author Raj Parsaniya
 * @see IBiConsumer
 * @since 1.0.0
 */
@FunctionalInterface
public interface IObjIntConsumer<T> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param t     the first input argument.
     * @param value the second input argument.
     * @param index the index of the current element.
     * @since 1.0.0
     */
    void accept(final T t, final int value, final int index);
}
