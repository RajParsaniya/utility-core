package io.github.rajparsaniya.function.functional.core;

/**
 * Represents a function that produces an int-valued result.  This is the
 * {@code int}-producing primitive specialization for {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsInt(Object, int)}.
 *
 * @param <T> the type of the input to the function.
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IToIntFunction<T> {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument.
     * @param index the index of the current element.
     * @return the function result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    int applyAsInt(final T value, final int index) throws Exception;
}
