package io.github.rajparsaniya.function.functional.index;

/**
 * Represents a function that produces a long-valued result.  This is the
 * {@code long}-producing primitive specialization for {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsLong(Object, int)}.
 *
 * @param <T> the type of the input to the function.
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IToLongFunction<T> {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument.
     * @param index the index of the current element.
     * @return the function result.
     * @since 1.0.0
     */
    long applyAsLong(final T value, final int index);
}
