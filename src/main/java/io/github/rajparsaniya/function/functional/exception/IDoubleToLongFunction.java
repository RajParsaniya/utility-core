package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents a function that accepts a double-valued argument and produces a
 * long-valued result.  This is the {@code double}-to-{@code long} primitive
 * specialization for {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsLong(double)}.
 *
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IDoubleToLongFunction {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument.
     * @return the function result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    long applyAsLong(final double value) throws Exception;
}
