package io.github.rajparsaniya.handler.stream.core.impl;

import io.github.rajparsaniya.function.stream.core.IBiConsumer;
import io.github.rajparsaniya.function.stream.core.IComparator;
import io.github.rajparsaniya.function.stream.core.IConsumer;
import io.github.rajparsaniya.function.stream.core.IFunction;
import io.github.rajparsaniya.function.stream.core.IPredicate;
import io.github.rajparsaniya.function.stream.core.IToDoubleFunction;
import io.github.rajparsaniya.function.stream.core.IToIntFunction;
import io.github.rajparsaniya.function.stream.core.IToLongFunction;
import io.github.rajparsaniya.handler.stream.core.IStreamHandler;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * The {@code StreamHandler} class provides an implementation of the
 * {@link IStreamHandler} interface.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class StreamHandler extends BaseHandler implements IStreamHandler {

    /**
     * Constructs a {@code StreamHandler} with a default behaviour.
     *
     * @since 1.0.0
     */
    public StreamHandler() {
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
    public <T, R> Function<T, R> map(final IFunction<T, R> mapper) {
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
    public <T> ToIntFunction<T> mapToInt(final IToIntFunction<T> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return mapper.applyAsInt(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToLongFunction<T> mapToLong(final IToLongFunction<T> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return mapper.applyAsLong(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToDoubleFunction<T> mapToDouble(final IToDoubleFunction<T> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return mapper.applyAsDouble(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, R> Function<T, Stream<R>> flatMap(final IFunction<T, Stream<R>> mapper) {
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
    public <T> Function<T, IntStream> flatMapToInt(final IFunction<T, IntStream> mapper) {
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
    public <T> Function<T, LongStream> flatMapToLong(final IFunction<T, LongStream> mapper) {
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
    public <T> Function<T, DoubleStream> flatMapToDouble(final IFunction<T, DoubleStream> mapper) {
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
    public <T, R> BiConsumer<T, Consumer<R>> mapMulti(final IBiConsumer<T, Consumer<R>> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, consumer) -> {
            try {
                mapper.accept(t, consumer, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> BiConsumer<T, IntConsumer> mapMultiToInt(final IBiConsumer<T, IntConsumer> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, intConsumer) -> {
            try {
                mapper.accept(t, intConsumer, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> BiConsumer<T, LongConsumer> mapMultiToLong(final IBiConsumer<T, LongConsumer> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, longConsumer) -> {
            try {
                mapper.accept(t, longConsumer, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> BiConsumer<T, DoubleConsumer> mapMultiToDouble(final IBiConsumer<T, DoubleConsumer> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, doubleConsumer) -> {
            try {
                mapper.accept(t, doubleConsumer, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Comparator<T> sorted(final IComparator<T> comparator) {
        final AtomicInteger atomicInteger1 = new AtomicInteger(super.initialIndex() + 1);
        final AtomicInteger atomicInteger2 = new AtomicInteger(super.initialIndex());
        return (o1, o2) -> {
            try {
                return comparator.compare(o1, o2, atomicInteger1.getAndIncrement(), atomicInteger2.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Consumer<T> peek(final IConsumer<T> action) {
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
    public <T> Predicate<T> takeWhile(final IPredicate<T> predicate) {
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
    public <T> Predicate<T> dropWhile(final IPredicate<T> predicate) {
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
    public <T> Consumer<T> forEach(final IConsumer<T> action) {
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
    public <T> Consumer<T> forEachOrdered(final IConsumer<T> action) {
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
    public <T> Predicate<T> anyMatch(final IPredicate<T> predicate) {
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
    public <T> Predicate<T> allMatch(final IPredicate<T> predicate) {
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
    public <T> Predicate<T> noneMatch(final IPredicate<T> predicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> {
            try {
                return predicate.test(t, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }
}
