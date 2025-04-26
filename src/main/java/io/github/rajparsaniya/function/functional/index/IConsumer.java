package io.github.rajparsaniya.function.functional.index;

/**
 * Represents an operation that accepts a single input argument and returns no
 * result. Unlike most other functional interfaces, {@code IConsumer} is expected
 * to operate via side effects.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #accept(Object, int)}.
 *
 * @param <T> the type of the input to the operation.
 * @author Raj Parsaniya
 * @since 1.0.0
 */
@FunctionalInterface
public interface IConsumer<T> {

    /**
     * Performs this operation on the given argument.
     *
     * @param t     the input argument.
     * @param index the index of the current element.
     * @since 1.0.0
     */
    void accept(final T t, final int index);
}
