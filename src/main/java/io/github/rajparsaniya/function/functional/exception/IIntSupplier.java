package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents a supplier of {@code int}-valued results.  This is the
 * {@code int}-producing primitive specialization of {@link ISupplier}.
 *
 * <p>There is no requirement that a distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #getAsInt()}.
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
     * @return a result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    int getAsInt() throws Exception;
}
