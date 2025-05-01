package io.github.rajparsaniya.function.functional.index;

/**
 * Represents a supplier of {@code int}-valued results.  This is the
 * {@code int}-producing primitive specialization of {@link ISupplier}.
 *
 * <p>There is no requirement that a distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #getAsInt(int)}.
 *
 * @author Raj Parsaniya
 * @see ISupplier
 * @since 1.0.0
 */
@FunctionalInterface
public interface IIntSupplier {

    /**
     * Gets a result.
     *
     * @param index the index of the current element.
     * @return a result.
     * @since 1.0.0
     */
    int getAsInt(final int index);
}
