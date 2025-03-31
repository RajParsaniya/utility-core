package io.github.rajparsaniya.function.exception;

/**
 * Represents a supplier of {@code double}-valued results.  This is the
 * {@code double}-producing primitive specialization of {@link ISupplier}.
 *
 * <p>There is no requirement that a distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a functional interface
 * whose functional method is {@link #getAsDouble()}.
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
     * @return a result.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    double getAsDouble() throws Exception;
}
