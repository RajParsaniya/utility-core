package io.github.rajparsaniya.handler.core.impl;

import io.github.rajparsaniya.function.core.IConsumer;
import io.github.rajparsaniya.function.core.IFunction;
import io.github.rajparsaniya.function.core.IPredicate;
import io.github.rajparsaniya.function.core.ISupplier;
import io.github.rajparsaniya.handler.core.IOptionalHandler;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OptionalHandler extends BaseHandler implements IOptionalHandler {
    @Override
    public <T> Consumer<T> ifPresent(final IConsumer<T> action) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> {
            try {
                action.accept(t, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Predicate<T> filter(final IPredicate<T> predicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> {
            try {
                return predicate.test(t, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> Function<T, U> map(final IFunction<T, U> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> {
            try {
                return mapper.apply(t, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> Function<T, Optional<U>> flatMap(final IFunction<T, Optional<U>> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> {
            try {
                return mapper.apply(t, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Supplier<Optional<T>> or(final ISupplier<Optional<T>> supplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> {
            try {
                return supplier.get(atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Supplier<T> orElseGet(final ISupplier<T> supplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> {
            try {
                return supplier.get(atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <X extends Throwable> Supplier<X> orElseThrow(final ISupplier<X> exceptionSupplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> {
            try {
                return exceptionSupplier.get(atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }
}
