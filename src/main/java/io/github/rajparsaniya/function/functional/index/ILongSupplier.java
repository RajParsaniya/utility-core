package io.github.rajparsaniya.function.functional.index;

/**
 * Represents a supplier of {@code long}-valued results.  This is the
 * {@code long}-producing primitive specialization of {@link ISupplier}.
 *
 * <p>There is no requirement that a distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #getAsLong(int)}.
 *
 * @author Raj Parsaniya
 * @see ISupplier
 * @since 1.0.0
 */
@FunctionalInterface
public interface ILongSupplier {

    /**
     * Gets a result.
     *
     * @param index the index of the current element.
     * @return a result
     * @since 1.0.0
     */
    long getAsLong(final int index);
}
