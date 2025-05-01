package io.github.rajparsaniya.handler.optional.exception;

import io.github.rajparsaniya.function.optional.exception.IConsumer;
import io.github.rajparsaniya.function.optional.exception.IFunction;
import io.github.rajparsaniya.function.optional.exception.IPredicate;
import io.github.rajparsaniya.function.optional.exception.ISupplier;
import io.github.rajparsaniya.handler.optional.core.IOptionalHandler;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * The {@code IOptionalExceptionHandler} interface provides enhanced exception
 * handling capabilities for working with {@link Optional}. It serves as a wrapper
 * around functional constructs, ensuring that exceptions are properly managed
 * while integrating seamlessly with {@link Optional} operations.
 *
 * <p>It provides various type of functional methods that can be directly used in
 * {@link Optional#ifPresent(Consumer)}, {@link Optional#filter(Predicate)},
 * {@link Optional#map(Function)}, and other standard {@link Optional} operations,
 * with built-in exception handling mechanisms.
 *
 * @author Raj Parsaniya
 * @see IOptionalHandler
 * @since 1.0.0
 */
public interface IOptionalExceptionHandler extends IBaseExceptionHandler {

    /**
     * Returns a {@link Consumer} that can be used in
     * {@link Optional#ifPresent(Consumer)}
     *
     * @param action the action to be performed, if a value is present.
     * @param <T>    the type of the value.
     * @return the {@link Consumer}
     * @since 1.0.0
     */
    <T> Consumer<T> ifPresent(final IConsumer<T> action);

    /**
     * Returns a {@link Predicate} that can be used in
     * {@link Optional#filter(Predicate)}
     *
     * @param predicate the predicate to apply to a value, if present.
     * @param <T>       the type of the value.
     * @return the {@link Predicate}
     * @since 1.0.0
     */
    <T> Predicate<T> filter(final IPredicate<T> predicate);

    /**
     * Returns a {@link Function} that can be used in
     * {@link Optional#map(Function)}
     *
     * @param mapper the mapping function to apply to a value, if present.
     * @param <T>    the type of the input value.
     * @param <U>    the type of the result.
     * @return the {@link Function}
     * @since 1.0.0
     */
    <T, U> Function<T, U> map(final IFunction<T, U> mapper);

    /**
     * Returns a {@link Function} that can be used in
     * {@link Optional#flatMap(Function)}
     *
     * @param mapper the mapping function to apply to a value, if present.
     * @param <T>    the type of the input value.
     * @param <U>    the type of the result inside the Optional.
     * @return the {@link Function}
     * @since 1.0.0
     */
    <T, U> Function<T, Optional<U>> flatMap(final IFunction<T, Optional<U>> mapper);

    /**
     * Returns a {@link Supplier} that can be used in
     * {@link Optional#or(Supplier)}
     *
     * @param supplier the supplying function that produces an {@code Optional}
     *                 to be returned.
     * @param <T>      the type of the value inside the Optional.
     * @return the {@link Supplier}
     * @since 1.0.0
     */
    <T> Supplier<Optional<T>> or(final ISupplier<Optional<T>> supplier);

    /**
     * Returns a {@link Supplier} that can be used in
     * {@link Optional#orElseGet(Supplier)}
     *
     * @param supplier the supplying function that produces a value to be returned.
     * @param <T>      the type of the value to be returned.
     * @return the {@link Supplier}
     * @since 1.0.0
     */
    <T> Supplier<T> orElseGet(final ISupplier<T> supplier);
}
