package io.github.rajparsaniya.function.functional.index;

/**
 * Represents a function that accepts two arguments and produces an int-valued
 * result.  This is the {@code int}-producing primitive specialization for
 * {@link IBiFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsInt(Object, Object, int)}.
 *
 * @param <T> the type of the first argument to the function.
 * @param <U> the type of the second argument to the function.
 * @author Raj Parsaniya
 * @see IBiFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IToIntBiFunction<T, U> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t     the first function argument.
     * @param u     the second function argument.
     * @param index the index of the current element.
     * @return the function result.
     * @since 1.0.0
     */
    int applyAsInt(final T t, final U u, final int index);
}
