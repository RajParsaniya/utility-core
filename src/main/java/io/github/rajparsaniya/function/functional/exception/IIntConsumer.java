package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents an operation that accepts a single {@code int}-valued argument and
 * returns no result.  This is the primitive type specialization of
 * {@link IConsumer} for {@code int}.  Unlike most other functional interfaces,
 * {@code IIntConsumer} is expected to operate via side effects.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #accept(int)}.
 *
 * @author Raj Parsaniya
 * @see IConsumer
 * @since 1.0.0
 */
@FunctionalInterface
public interface IIntConsumer {

    /**
     * Performs this operation on the given argument.
     *
     * @param value the input argument.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    void accept(final int value) throws Exception;
}
