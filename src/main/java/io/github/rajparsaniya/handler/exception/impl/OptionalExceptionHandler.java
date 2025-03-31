package io.github.rajparsaniya.handler.exception.impl;

import io.github.rajparsaniya.exception.handler.OptionalHandlerException;
import io.github.rajparsaniya.function.exception.IConsumer;
import io.github.rajparsaniya.function.exception.IFunction;
import io.github.rajparsaniya.function.exception.IPredicate;
import io.github.rajparsaniya.function.exception.ISupplier;
import io.github.rajparsaniya.handler.exception.IOptionalExceptionHandler;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OptionalExceptionHandler extends BaseExceptionHandler implements IOptionalExceptionHandler {
    public OptionalExceptionHandler() {
        super.setThrowable((e) -> new OptionalHandlerException(e));
    }

    public OptionalExceptionHandler(final Supplier<? extends RuntimeException> exception) {
        super(exception);
    }

    public OptionalExceptionHandler(final Function<Exception, ? extends RuntimeException> exception) {
        super(exception);
    }

    @Override
    public <T> Consumer<T> ifPresent(final IConsumer<T> action) {
        return t -> {
            try {
                action.accept(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Predicate<T> filter(final IPredicate<T> predicate) {
        return t -> {
            try {
                return predicate.test(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> Function<T, U> map(final IFunction<T, U> mapper) {
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> Function<T, Optional<U>> flatMap(final IFunction<T, Optional<U>> mapper) {
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Supplier<Optional<T>> or(final ISupplier<Optional<T>> supplier) {
        return () -> {
            try {
                return supplier.get();
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Supplier<T> orElseGet(final ISupplier<T> supplier) {
        return () -> {
            try {
                return supplier.get();
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <X extends Throwable> Supplier<X> orElseThrow(final ISupplier<X> exceptionSupplier) {
        return () -> {
            try {
                return exceptionSupplier.get();
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }
}
