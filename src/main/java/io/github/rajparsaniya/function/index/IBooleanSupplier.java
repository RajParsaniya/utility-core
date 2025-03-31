package io.github.rajparsaniya.function.index;

/**
 * Represents a supplier of {@code boolean}-valued results.  This is the
 * {@code boolean}-producing primitive specialization of {@link ISupplier}.
 *
 * <p>There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #getAsBoolean(int)}.
 *
 * @author Raj Parsaniya
 * @see ISupplier
 * @since 1.0.0
 */
@FunctionalInterface
public interface IBooleanSupplier {

    /**
     * Gets a result.
     *
     * @param index the index of the current element.
     * @return a result.
     * @since 1.0.0
     */
    boolean getAsBoolean(final int index);
}
