package io.github.rajparsaniya.function.functional.core;

/**
 * Represents a function that accepts a double-valued argument and produces a
 * result.  This is the {@code double}-consuming primitive specialization for
 * {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #apply(double, int)}.
 *
 * @param <R> the type of the result of the function.
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IDoubleFunction<R> {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument.
     * @param index the index of the current element.
     * @return the function result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    R apply(final double value, final int index) throws Exception;
}
