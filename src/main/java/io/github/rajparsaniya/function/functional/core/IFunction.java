package io.github.rajparsaniya.function.functional.core;

/**
 * Represents a function that accepts one argument and produces a result.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #apply(Object, int)}.
 *
 * @param <T> the type of the input to the function.
 * @param <R> the type of the result of the function.
 * @author Raj Parsaniya
 * @since 1.0.0
 */
@FunctionalInterface
public interface IFunction<T, R> {

    /**
     * Applies this function to the given argument.
     *
     * @param t     the function argument.
     * @param index the index of the current element.
     * @return the function result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    R apply(final T t, final int index) throws Exception;
}
