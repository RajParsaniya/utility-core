package io.github.rajparsaniya.handler.index;

import io.github.rajparsaniya.function.index.IConsumer;
import io.github.rajparsaniya.function.index.IFunction;
import io.github.rajparsaniya.function.index.IPredicate;
import io.github.rajparsaniya.function.index.ISupplier;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface IOptionalIndexHandler extends IBaseIndexHandler {
    <T> Consumer<T> ifPresent(final IConsumer<T> action);

    <T> Predicate<T> filter(final IPredicate<T> predicate);

    <T, U> Function<T, U> map(final IFunction<T, U> mapper);

    <T, U> Function<T, Optional<U>> flatMap(final IFunction<T, Optional<U>> mapper);

    <T> Supplier<Optional<T>> or(final ISupplier<Optional<T>> supplier);

    <T> Supplier<T> orElseGet(final ISupplier<T> supplier);

    <X extends Throwable> Supplier<X> orElseThrow(final ISupplier<X> exceptionSupplier);
}
