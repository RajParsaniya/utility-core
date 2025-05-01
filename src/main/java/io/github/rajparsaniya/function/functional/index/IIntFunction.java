package io.github.rajparsaniya.function.functional.index;

/**
 * Represents a function that accepts an int-valued argument and produces a
 * result.  This is the {@code int}-consuming primitive specialization for
 * {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #apply(int, int)}.
 *
 * @param <R> the type of the result of the function.
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IIntFunction<R> {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument.
     * @param index the index of the current element.
     * @return the function result.
     * @since 1.0.0
     */
    R apply(final int value, final int index);
}
