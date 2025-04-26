package io.github.rajparsaniya.function.functional.index;

/**
 * Represents a predicate (boolean-valued function) of one {@code int}-valued
 * argument. This is the {@code int}-consuming primitive type specialization of
 * {@link IPredicate}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #test(int, int)}.
 *
 * @author Raj Parsaniya
 * @see IPredicate
 * @since 1.0.0
 */
@FunctionalInterface
public interface IIntPredicate {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param value the input argument.
     * @param index the index of the current element.
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     * @since 1.0.0
     */
    boolean test(final int value, final int index);
}
