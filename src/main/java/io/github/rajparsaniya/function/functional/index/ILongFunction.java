package io.github.rajparsaniya.function.functional.index;

/**
 * Represents a function that accepts a long-valued argument and produces a
 * result.  This is the {@code long}-consuming primitive specialization for
 * {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #apply(long, int)}.
 *
 * @param <R> the type of the result of the function.
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface ILongFunction<R> {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument.
     * @param index the index of the current element.
     * @return the function result.
     * @since 1.0.0
     */
    R apply(final long value, final int index);
}
