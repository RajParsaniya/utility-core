package io.github.rajparsaniya.function.functional.core;

/**
 * Represents an operation on a single operand that produces a result of the
 * same type as its operand.  This is a specialization of {@link IFunction} for
 * the case where the operand and result are of the same type.
 *
 * <p>This is a functional interface whose functional method is
 * {@link #apply(Object, int)}.
 *
 * @param <T> the type of the operand and result of the operator.
 * @author Raj Parsaniya
 * @see IFunction
 * @since 1.0.0
 */
@FunctionalInterface
public interface IUnaryOperator<T> extends IFunction<T, T> {
}
