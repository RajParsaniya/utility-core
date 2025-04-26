package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents a predicate (boolean-valued function) of one argument.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #test(Object)}.
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
     * @param t the input argument.
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    boolean test(final T t) throws Exception;
}
