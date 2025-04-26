package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents a function that accepts two arguments and produces a result.
 * This is the two-arity specialization of {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #apply(Object, Object)}.
 *
 * @param <T> the type of the first argument to the function.
 * @param <U> the type of the second argument to the function.
 * @param <R> the type of the result of the function.
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IBiFunction<T, U, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument.
     * @param u the second function argument.
     * @return the function result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    R apply(final T t, final U u) throws Exception;
}
