package io.github.rajparsaniya.handler.stream.index.impl;

import io.github.rajparsaniya.function.stream.index.IBiConsumer;
import io.github.rajparsaniya.function.stream.index.IComparator;
import io.github.rajparsaniya.function.stream.index.IConsumer;
import io.github.rajparsaniya.function.stream.index.IFunction;
import io.github.rajparsaniya.function.stream.index.IPredicate;
import io.github.rajparsaniya.function.stream.index.IToDoubleFunction;
import io.github.rajparsaniya.function.stream.index.IToIntFunction;
import io.github.rajparsaniya.function.stream.index.IToLongFunction;
import io.github.rajparsaniya.handler.stream.index.IStreamIndexHandler;

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
 * The {@code StreamIndexHandler} class provides an implementation of the
 * {@link IStreamIndexHandler} interface.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class StreamIndexHandler extends BaseIndexHandler implements IStreamIndexHandler {

    /**
     * Constructs a {@code StreamIndexHandler} with a default behaviour.
     *
     * @since 1.0.0
     */
    public StreamIndexHandler() {
    }

    /**
     * Constructs a {@code StreamIndexHandler} with a specified initial index.
     *
     * @param initialIndex the initial index value to be set.
     * @since 1.0.0
     */
    public StreamIndexHandler(final Integer initialIndex) {
        super(initialIndex);
    }

    @Override
    public <T> Predicate<T> filter(final IPredicate<T> predicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> predicate.test(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, R> Function<T, R> map(final IFunction<T, R> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> mapper.apply(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> ToIntFunction<T> mapToInt(final IToIntFunction<T> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> mapper.applyAsInt(value, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> ToLongFunction<T> mapToLong(final IToLongFunction<T> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> mapper.applyAsLong(value, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> ToDoubleFunction<T> mapToDouble(final IToDoubleFunction<T> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> mapper.applyAsDouble(value, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, R> Function<T, Stream<R>> flatMap(final IFunction<T, Stream<R>> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> mapper.apply(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Function<T, IntStream> flatMapToInt(final IFunction<T, IntStream> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> mapper.apply(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Function<T, LongStream> flatMapToLong(final IFunction<T, LongStream> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> mapper.apply(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Function<T, DoubleStream> flatMapToDouble(final IFunction<T, DoubleStream> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> mapper.apply(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, R> BiConsumer<T, Consumer<R>> mapMulti(final IBiConsumer<T, Consumer<R>> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, consumer) -> mapper.accept(t, consumer, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> BiConsumer<T, IntConsumer> mapMultiToInt(final IBiConsumer<T, IntConsumer> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, intConsumer) -> mapper.accept(t, intConsumer, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> BiConsumer<T, LongConsumer> mapMultiToLong(final IBiConsumer<T, LongConsumer> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, longConsumer) -> mapper.accept(t, longConsumer, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> BiConsumer<T, DoubleConsumer> mapMultiToDouble(final IBiConsumer<T, DoubleConsumer> mapper) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, doubleConsumer) -> mapper.accept(t, doubleConsumer, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Comparator<T> sorted(final IComparator<T> comparator) {
        final AtomicInteger atomicInteger1 = new AtomicInteger(super.initialIndex() + 1);
        final AtomicInteger atomicInteger2 = new AtomicInteger(super.initialIndex());
        return (o1, o2) -> comparator.compare(o1, o2, atomicInteger1.getAndIncrement(), atomicInteger2.getAndIncrement());
    }

    @Override
    public <T> Consumer<T> peek(final IConsumer<T> action) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> action.accept(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Predicate<T> takeWhile(final IPredicate<T> predicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> predicate.test(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Predicate<T> dropWhile(final IPredicate<T> predicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> predicate.test(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Consumer<T> forEach(final IConsumer<T> action) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> action.accept(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Consumer<T> forEachOrdered(final IConsumer<T> action) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> action.accept(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Predicate<T> anyMatch(final IPredicate<T> predicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> predicate.test(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Predicate<T> allMatch(final IPredicate<T> predicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> predicate.test(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Predicate<T> noneMatch(final IPredicate<T> predicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> predicate.test(t, atomicInteger.getAndIncrement());
    }
}
