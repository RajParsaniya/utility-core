package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents an operation that accepts two input arguments and returns no
 * result.  This is the two-arity specialization of {@link IConsumer}.
 * Unlike most other functional interfaces, {@code IBiConsumer} is expected
 * to operate via side effects.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #accept(Object, Object)}.
 *
 * @param <T> the type of the first argument to the operation.
 * @param <U> the type of the second argument to the operation.
 * @author Raj Parsaniya
 * @see IConsumer
 * @since 1.0.0
 */
@FunctionalInterface
public interface IBiConsumer<T, U> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param t the first input argument.
     * @param u the second input argument.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    void accept(final T t, final U u) throws Exception;
}
