package io.github.rajparsaniya.function.index;

/**
 * Represents a function that accepts two arguments and produces a double-valued
 * result.  This is the {@code double}-producing primitive specialization for
 * {@link IBiFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsDouble(Object, Object, int)}.
 *
 * @param <T> the type of the first argument to the function.
 * @param <U> the type of the second argument to the function.
 * @author Raj Parsaniya
 * @see IBiFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IToDoubleBiFunction<T, U> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t     the first function argument.
     * @param u     the second function argument.
     * @param index the index of the current element.
     * @return the function result.
     * @since 1.0.0
     */
    double applyAsDouble(final T t, final U u, final int index);
}
