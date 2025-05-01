package io.github.rajparsaniya.handler.optional.core.impl;

import io.github.rajparsaniya.function.optional.core.IConsumer;
import io.github.rajparsaniya.function.optional.core.IFunction;
import io.github.rajparsaniya.function.optional.core.IPredicate;
import io.github.rajparsaniya.function.optional.core.ISupplier;
import io.github.rajparsaniya.handler.optional.core.IOptionalHandler;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * The {@code OptionalHandler} class provides an implementation of the
 * {@link IOptionalHandler} interface.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class OptionalHandler extends BaseHandler implements IOptionalHandler {

    /**
     * Constructs a {@code OptionalHandler} with a default behaviour.
     *
     * @since 1.0.0
     */
    public OptionalHandler() {
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
}
