package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents a function that produces a double-valued result.  This is the
 * {@code double}-producing primitive specialization for {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsDouble(Object)}.
 *
 * @param <T> the type of the input to the function
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IToDoubleFunction<T> {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument.
     * @return the function result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    double applyAsDouble(final T value) throws Exception;
}
