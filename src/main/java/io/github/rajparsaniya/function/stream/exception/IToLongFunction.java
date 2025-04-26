package io.github.rajparsaniya.function.stream.exception;

/**
 * Represents a function that produces a long-valued result.  This is the
 * {@code long}-producing primitive specialization for {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsLong(Object)}.
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
     * @return the function result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    long applyAsLong(final T value) throws Exception;
}
