package io.github.rajparsaniya.handler.stream.exception;

import io.github.rajparsaniya.function.stream.exception.IBiConsumer;
import io.github.rajparsaniya.function.stream.exception.IComparator;
import io.github.rajparsaniya.function.stream.exception.IConsumer;
import io.github.rajparsaniya.function.stream.exception.IFunction;
import io.github.rajparsaniya.function.stream.exception.IPredicate;
import io.github.rajparsaniya.function.stream.exception.IToDoubleFunction;
import io.github.rajparsaniya.function.stream.exception.IToIntFunction;
import io.github.rajparsaniya.function.stream.exception.IToLongFunction;

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

/**
 * The {@code IStreamExceptionHandler} interface offers a way to manage exceptions
 * that might occur during operations within a {@link Stream}.
 *
 * <p>This interface provides functional equivalents for common stream operations,
 * allowing for safe exception handling without disrupting the stream processing flow.
 * It includes enhanced versions of {@link Stream#filter(Predicate)}, {@link Stream#map(Function)},
 * {@link Stream#sorted(Comparator)}, and other standard {@link Stream} operations that support
 * exception handling.
 *
 * <p>By wrapping functional interfaces with exception-handling capabilities,
 * this interface ensures that checked exceptions can be properly managed without
 * forcing the use of try-catch blocks inside stream operations.
 *
 * @author Raj Parsaniya
 * @see IBaseExceptionHandler
 * @since 1.0.0
 */
public interface IStreamExceptionHandler extends IBaseExceptionHandler {

    /**
     * Returns a {@link Predicate} that can be used in
     * {@link Stream#filter(Predicate)}
     *
     * @param predicate a non-interfering, stateless predicate to apply to
     *                  each element to determine if it should be included.
     * @param <T>       the type of elements in the stream.
     * @return the {@link Predicate}
     * @since 1.0.0
     */
    <T> Predicate<T> filter(final IPredicate<T> predicate);

    /**
     * Returns a {@link Function} that can be used in
     * {@link Stream#map(Function)}
     *
     * @param mapper a non-interfering, stateless function to apply to
     *               each element.
     * @param <T>    the type of input elements in the stream.
     * @param <R>    the type of output elements in the stream.
     * @return the {@link Function}
     * @since 1.0.0
     */
    <T, R> Function<T, R> map(final IFunction<T, R> mapper);

    /**
     * Returns a {@link ToIntFunction} that can be used in
     * {@link Stream#mapToInt(ToIntFunction)}
     *
     * @param mapper a non-interfering, stateless function to apply to
     *               each element.
     * @param <T>    the type of elements in the stream.
     * @return the {@link ToIntFunction}
     * @since 1.0.0
     */
    <T> ToIntFunction<T> mapToInt(final IToIntFunction<T> mapper);

    /**
     * Returns a {@link ToLongFunction} that can be used in
     * {@link Stream#mapToLong(ToLongFunction)}
     *
     * @param mapper a non-interfering, stateless function to apply to
     *               each element.
     * @param <T>    the type of elements in the stream.
     * @return the {@link ToLongFunction}
     * @since 1.0.0
     */
    <T> ToLongFunction<T> mapToLong(final IToLongFunction<T> mapper);

    /**
     * Returns a {@link ToDoubleFunction} that can be used in
     * {@link Stream#mapToDouble(ToDoubleFunction)}
     *
     * @param mapper a non-interfering, stateless function to apply to
     *               each element.
     * @param <T>    the type of elements in the stream.
     * @return the {@link ToDoubleFunction}
     * @since 1.0.0
     */
    <T> ToDoubleFunction<T> mapToDouble(final IToDoubleFunction<T> mapper);

    /**
     * Returns a {@link Function} that can be used in
     * {@link Stream#flatMap(Function)}
     *
     * @param mapper a non-interfering, stateless function to apply to
     *               each element which produces a stream of new values.
     * @param <T>    the type of input elements in the stream.
     * @param <R>    the type of output elements in the resulting stream.
     * @return the {@link Function}
     * @see #mapMulti
     * @since 1.0.0
     */
    <T, R> Function<T, Stream<R>> flatMap(final IFunction<T, Stream<R>> mapper);

    /**
     * Returns a {@link Function} that can be used in
     * {@link Stream#flatMapToInt(Function)}
     *
     * @param mapper a non-interfering, stateless function to apply to
     *               each element which produces a stream of new values.
     * @param <T>    the type of elements in the stream.
     * @return the {@link Function}
     * @see #flatMap
     * @since 1.0.0
     */
    <T> Function<T, IntStream> flatMapToInt(final IFunction<T, IntStream> mapper);

    /**
     * Returns a {@link Function} that can be used in
     * {@link Stream#flatMapToLong(Function)}
     *
     * @param mapper a non-interfering, stateless function to apply to
     *               each element which produces a stream of new values.
     * @param <T>    the type of elements in the stream.
     * @return the {@link Function}
     * @see #flatMap
     * @since 1.0.0
     */
    <T> Function<T, LongStream> flatMapToLong(final IFunction<T, LongStream> mapper);

    /**
     * Returns a {@link Function} that can be used in
     * {@link Stream#flatMapToDouble(Function)}
     *
     * @param mapper a non-interfering, stateless function to apply to
     *               each element which produces a stream of new values.
     * @param <T>    the type of elements in the stream.
     * @return the {@link Function}
     * @see #flatMap
     * @since 1.0.0
     */
    <T> Function<T, DoubleStream> flatMapToDouble(final IFunction<T, DoubleStream> mapper);

    /**
     * Returns a {@link BiConsumer} that can be used in
     * {@link Stream#mapMulti(BiConsumer)}
     *
     * @param mapper a non-interfering, stateless function that generates
     *               replacement elements.
     * @param <T>    the type of input elements in the stream.
     * @param <R>    the type of output elements in the stream.
     * @return the {@link BiConsumer}
     * @since 1.0.0
     */
    <T, R> BiConsumer<T, Consumer<R>> mapMulti(final IBiConsumer<T, Consumer<R>> mapper);

    /**
     * Returns a {@link BiConsumer} that can be used in
     * {@link Stream#mapMultiToInt(BiConsumer)}
     *
     * @param mapper a non-interfering, stateless function that generates
     *               replacement elements.
     * @param <T>    the type of elements in the stream.
     * @return the {@link BiConsumer}
     * @since 1.0.0
     */
    <T> BiConsumer<T, IntConsumer> mapMultiToInt(final IBiConsumer<T, IntConsumer> mapper);

    /**
     * Returns a {@link BiConsumer} that can be used in
     * {@link Stream#mapMultiToLong(BiConsumer)}
     *
     * @param mapper a non-interfering, stateless function that generates
     *               replacement elements.
     * @param <T>    the type of elements in the stream.
     * @return the {@link BiConsumer}
     * @since 1.0.0
     */
    <T> BiConsumer<T, LongConsumer> mapMultiToLong(final IBiConsumer<T, LongConsumer> mapper);

    /**
     * Returns a {@link BiConsumer} that can be used in
     * {@link Stream#mapMultiToDouble(BiConsumer)}
     *
     * @param mapper a non-interfering, stateless function that generates
     *               replacement elements.
     * @param <T>    the type of elements in the stream.
     * @return the {@link BiConsumer}
     * @since 1.0.0
     */
    <T> BiConsumer<T, DoubleConsumer> mapMultiToDouble(final IBiConsumer<T, DoubleConsumer> mapper);

    /**
     * Returns a {@link Comparator} that can be used in
     * {@link Stream#sorted(Comparator)}
     *
     * @param comparator a non-interfering, stateless Comparator to be used
     *                   to compare stream elements.
     * @param <T>        the type of elements in the stream.
     * @return the {@link Comparator}
     * @since 1.0.0
     */
    <T> Comparator<T> sorted(final IComparator<T> comparator);

    /**
     * Returns a {@link Consumer} that can be used in
     * {@link Stream#peek(Consumer)}
     *
     * @param action the number of elements the stream should be limited to.
     * @param <T>    the type of elements in the stream.
     * @return the {@link Consumer}
     * @since 1.0.0
     */
    <T> Consumer<T> peek(final IConsumer<T> action);

    /**
     * Returns a {@link Predicate} that can be used in
     * {@link Stream#takeWhile(Predicate)}
     *
     * @param predicate a non-interfering, stateless predicate to apply to
     *                  elements to determine the longest prefix of elements.
     * @param <T>       the type of elements in the stream.
     * @return the {@link Predicate}
     * @since 1.0.0
     */
    <T> Predicate<T> takeWhile(final IPredicate<T> predicate);

    /**
     * Returns a {@link Predicate} that can be used in
     * {@link Stream#dropWhile(Predicate)}
     *
     * @param predicate a non-interfering, stateless predicate to apply to
     *                  elements to determine the longest prefix of elements.
     * @param <T>       the type of elements in the stream.
     * @return the {@link Predicate}
     * @since 1.0.0
     */
    <T> Predicate<T> dropWhile(final IPredicate<T> predicate);

    /**
     * Returns a {@link Consumer} that can be used in
     * {@link Stream#forEach(Consumer)}
     *
     * @param action a non-interfering action to perform on the elements.
     * @param <T>    the type of elements in the stream.
     * @return the {@link Consumer}
     * @since 1.0.0
     */
    <T> Consumer<T> forEach(final IConsumer<T> action);

    /**
     * Returns a {@link Consumer} that can be used in
     * {@link Stream#forEachOrdered(Consumer)}
     *
     * @param action a non-interfering action to perform on the elements.
     * @param <T>    the type of elements in the stream.
     * @return the {@link Consumer}
     * @since 1.0.0
     */
    <T> Consumer<T> forEachOrdered(final IConsumer<T> action);

    /**
     * Returns a {@link Predicate} that can be used in
     * {@link Stream#anyMatch(Predicate)}
     *
     * @param predicate a non-interfering, stateless predicate to apply
     *                  to elements of this stream.
     * @param <T>       the type of elements in the stream.
     * @return the {@link Predicate}
     * @since 1.0.0
     */
    <T> Predicate<T> anyMatch(final IPredicate<T> predicate);

    /**
     * Returns a {@link Predicate} that can be used in
     * {@link Stream#allMatch(Predicate)}
     *
     * @param predicate a non-interfering, stateless predicate to apply to
     *                  elements of this stream.
     * @param <T>       the type of elements in the stream.
     * @return the {@link Predicate}
     * @since 1.0.0
     */
    <T> Predicate<T> allMatch(final IPredicate<T> predicate);

    /**
     * Returns a {@link Predicate} that can be used in
     * {@link Stream#noneMatch(Predicate)}
     *
     * @param predicate a non-interfering, stateless predicate to apply to
     *                  elements of this stream.
     * @param <T>       the type of elements in the stream.
     * @return the {@link Predicate}
     * @since 1.0.0
     */
    <T> Predicate<T> noneMatch(final IPredicate<T> predicate);
}
