package io.github.rajparsaniya.function.functional.index;

/**
 * Represents a supplier of {@code double}-valued results.  This is the
 * {@code double}-producing primitive specialization of {@link ISupplier}.
 *
 * <p>There is no requirement that a distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a functional interface
 * whose functional method is {@link #getAsDouble(int)}.
 *
 * @author Raj Parsaniya
 * @see ISupplier
 * @since 1.0.0
 */
@FunctionalInterface
public interface IDoubleSupplier {

    /**
     * Gets a result.
     *
     * @param index the index of the current element.
     * @return a result.
     * @since 1.0.0
     */
    double getAsDouble(final int index);
}
