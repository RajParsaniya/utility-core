package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents a function that accepts a long-valued argument and produces a
 * double-valued result.  This is the {@code long}-to-{@code double} primitive
 * specialization for {@link IFunction}.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #applyAsDouble(long)}.
 *
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface ILongToDoubleFunction {

    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument.
     * @return the function result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    double applyAsDouble(final long value) throws Exception;
}
