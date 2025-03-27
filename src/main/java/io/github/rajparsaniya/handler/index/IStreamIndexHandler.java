package io.github.rajparsaniya.handler.index;

import io.github.rajparsaniya.function.index.IBiConsumer;
import io.github.rajparsaniya.function.index.IComparator;
import io.github.rajparsaniya.function.index.IConsumer;
import io.github.rajparsaniya.function.index.IFunction;
import io.github.rajparsaniya.function.index.IPredicate;
import io.github.rajparsaniya.function.index.IToDoubleFunction;
import io.github.rajparsaniya.function.index.IToIntFunction;
import io.github.rajparsaniya.function.index.IToLongFunction;

import java.util.Comparator;
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

public interface IStreamIndexHandler extends IBaseIndexHandler {
    <T> Predicate<T> filter(final IPredicate<T> predicate);

    <T, R> Function<T, R> map(final IFunction<T, R> mapper);

    <T> ToIntFunction<T> mapToInt(final IToIntFunction<T> mapper);

    <T> ToLongFunction<T> mapToLong(final IToLongFunction<T> mapper);

    <T> ToDoubleFunction<T> mapToDouble(final IToDoubleFunction<T> mapper);

    <T, R> Function<T, Stream<R>> flatMap(final IFunction<T, Stream<R>> mapper);

    <T> Function<T, IntStream> flatMapToInt(final IFunction<T, IntStream> mapper);

    <T> Function<T, LongStream> flatMapToLong(final IFunction<T, LongStream> mapper);

    <T> Function<T, DoubleStream> flatMapToDouble(final IFunction<T, DoubleStream> mapper);

    <T, R> BiConsumer<T, Consumer<R>> mapMulti(final IBiConsumer<T, Consumer<R>> mapper);

    <T> BiConsumer<T, IntConsumer> mapMultiToInt(final IBiConsumer<T, IntConsumer> mapper);

    <T> BiConsumer<T, LongConsumer> mapMultiToLong(final IBiConsumer<T, LongConsumer> mapper);

    <T> BiConsumer<T, DoubleConsumer> mapMultiToDouble(final IBiConsumer<T, DoubleConsumer> mapper);

    <T> Comparator<T> sorted(final IComparator<T> comparator);

    <T> Consumer<T> peek(final IConsumer<T> action);

    <T> Predicate<T> takeWhile(final IPredicate<T> predicate);

    <T> Predicate<T> dropWhile(final IPredicate<T> predicate);

    <T> Consumer<T> forEach(final IConsumer<T> action);

    <T> Consumer<T> forEachOrdered(final IConsumer<T> action);

    <T> Predicate<T> anyMatch(final IPredicate<T> predicate);

    <T> Predicate<T> allMatch(final IPredicate<T> predicate);

    <T> Predicate<T> noneMatch(final IPredicate<T> predicate);
}
