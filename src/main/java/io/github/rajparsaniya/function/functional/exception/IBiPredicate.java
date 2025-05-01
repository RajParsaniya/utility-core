package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents a predicate (boolean-valued function) of two arguments.
 * This is the two-arity specialization of {@link IPredicate}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #test(Object, Object)}.
 *
 * @param <T> the type of the first argument to the predicate.
 * @param <U> the type of the second argument the predicate.
 * @author Raj Parsaniya
 * @see IPredicate
 * @since 1.0.0
 */
@FunctionalInterface
public interface IBiPredicate<T, U> {

    /**
     * Evaluates this predicate on the given arguments.
     *
     * @param t the first input argument.
     * @param u the second input argument.
     * @return {@code true} if the input arguments match the predicate,
     * otherwise {@code false}
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    boolean test(final T t, final U u) throws Exception;
}
