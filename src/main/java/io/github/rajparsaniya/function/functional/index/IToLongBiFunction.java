package io.github.rajparsaniya.function.functional.index;

/**
 * Represents a function that accepts two arguments and produces a long-valued
 * result.  This is the {@code long}-producing primitive specialization for
 * {@link IBiFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsLong(Object, Object, int)}.
 *
 * @param <T> the type of the first argument to the function.
 * @param <U> the type of the second argument to the function.
 * @author Raj Parsaniya
 * @see IBiFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IToLongBiFunction<T, U> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t     the first function argument.
     * @param u     the second function argument.
     * @param index the index of the current element.
     * @return the function result.
     * @since 1.0.0
     */
    long applyAsLong(final T t, final U u, final int index);
}
