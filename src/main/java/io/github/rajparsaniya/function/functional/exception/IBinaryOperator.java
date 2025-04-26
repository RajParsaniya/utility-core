package io.github.rajparsaniya.function.functional.exception;

/**
 * Represents an operation upon two operands of the same type, producing a
 * result of the same type as the operands.  This is a specialization of
 * {@link IBiFunction} for the case where the operands and the result are
 * all the same type.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #apply(Object, Object)}.
 *
 * @param <T> the type of the operands and result of the operator.
 * @author Raj Parsaniya
 * @see IBiFunction
 * @see IUnaryOperator
 * @since 1.0.0
 */
@FunctionalInterface
public interface IBinaryOperator<T> extends IBiFunction<T, T, T> {
}
