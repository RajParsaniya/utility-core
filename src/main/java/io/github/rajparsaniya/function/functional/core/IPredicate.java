package io.github.rajparsaniya.function.functional.core;

/**
 * Represents a predicate (boolean-valued function) of one argument.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #test(Object, int)}.
 *
 * @param <T> the type of the input to the predicate.
 * @author Raj Parsaniya
 * @since 1.0.0
 */
@FunctionalInterface
public interface IPredicate<T> {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param t     the input argument.
     * @param index the index of the current element.
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    boolean test(final T t, final int index) throws Exception;
}
