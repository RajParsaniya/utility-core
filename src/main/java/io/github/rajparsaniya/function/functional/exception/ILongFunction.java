package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents a function that accepts a long-valued argument and produces a
 * result.  This is the {@code long}-consuming primitive specialization for
 * {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #apply(long)}.
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
     * @return the function result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    R apply(final long value) throws Exception;
}
