package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents a function that accepts a long-valued argument and produces an
 * int-valued result.  This is the {@code long}-to-{@code int} primitive
 * specialization for {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsInt(long)}.
 *
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface ILongToIntFunction {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument.
     * @return the function result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    int applyAsInt(long value) throws Exception;
}
