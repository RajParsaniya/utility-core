package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents an operation that accepts an object-valued and a
 * {@code long}-valued argument, and returns no result.  This is the
 * {@code (reference, long)} specialization of {@link IBiConsumer}.
 * Unlike most other functional interfaces, {@code IObjLongConsumer} is
 * expected to operate via side effects.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #accept(Object, long)}.
 *
 * @param <T> the type of the object argument to the operation.
 * @author Raj Parsaniya
 * @see IBiConsumer
 * @since 1.0.0
 */
@FunctionalInterface
public interface IObjLongConsumer<T> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param t     the first input argument.
     * @param value the second input argument.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    void accept(final T t, final long value) throws Exception;
}
