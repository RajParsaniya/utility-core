package io.github.rajparsaniya.handler;

import io.github.rajparsaniya.function.IConsumer;
import io.github.rajparsaniya.function.IFunction;
import io.github.rajparsaniya.function.IPredicate;
import io.github.rajparsaniya.function.ISupplier;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface IOptionalHandler extends IBaseHandler {
    <T> Consumer<T> ifPresent(final IConsumer<T> action);

    <T> Predicate<T> filter(final IPredicate<T> predicate);

    <T, U> Function<T, U> map(final IFunction<T, U> mapper);

    <T, U> Function<T, Optional<U>> flatMap(final IFunction<T, Optional<U>> mapper);

    <T> Supplier<Optional<T>> or(final ISupplier<Optional<T>> supplier);

    <T> Supplier<T> orElseGet(final ISupplier<T> supplier);

    <X extends Throwable> Supplier<X> orElseThrow(final ISupplier<X> exceptionSupplier);
}
