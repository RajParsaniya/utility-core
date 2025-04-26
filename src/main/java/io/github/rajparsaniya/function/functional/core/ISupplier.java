package io.github.rajparsaniya.function.functional.core;

/**
 * Represents a supplier of results.
 *
 * <p>There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #get(int)}.
 *
 * @param <T> the type of results supplied by this supplier.
 * @author Raj Parsaniya
 * @since 1.0.0
 */
@FunctionalInterface
public interface ISupplier<T> {

    /**
     * Gets a result.
     *
     * @param index the index of the current element.
     * @return a result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    T get(final int index) throws Exception;
}
