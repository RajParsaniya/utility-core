package io.github.rajparsaniya.handler.index.impl;

import io.github.rajparsaniya.function.index.IConsumer;
import io.github.rajparsaniya.function.index.IFunction;
import io.github.rajparsaniya.function.index.IPredicate;
import io.github.rajparsaniya.function.index.ISupplier;
import io.github.rajparsaniya.handler.index.IOptionalIndexHandler;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * The {@code OptionalIndexHandler} class provides an implementation of the
 * {@link IOptionalIndexHandler} interface.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class OptionalIndexHandler extends BaseIndexHandler implements IOptionalIndexHandler {

    /**
     * Constructs a {@code OptionalIndexHandler} with a default behaviour.
     *
     * @since 1.0.0
     */
    public OptionalIndexHandler() {
    }

    /**
     * Constructs a {@code OptionalIndexHandler} with a specified initial index.
     *
     * @param initialIndex the initial index value to be set.
     * @since 1.0.0
     */
    public OptionalIndexHandler(final Integer initialIndex) {
        super(initialIndex);
    }

    @Override
    public <T> Consumer<T> ifPresent(final IConsumer<T> action) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> action.accept(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Predicate<T> filter(final IPredicate<T> predicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> predicate.test(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, U> Function<T, U> map(final IFunction<T, U> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> mapper.apply(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, U> Function<T, Optional<U>> flatMap(final IFunction<T, Optional<U>> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> mapper.apply(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Supplier<Optional<T>> or(final ISupplier<Optional<T>> supplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> supplier.get(atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Supplier<T> orElseGet(final ISupplier<T> supplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> supplier.get(atomicInteger.getAndIncrement());
    }

    @Override
    public <X extends Throwable> Supplier<X> orElseThrow(final ISupplier<X> exceptionSupplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> exceptionSupplier.get(atomicInteger.getAndIncrement());
    }
}
