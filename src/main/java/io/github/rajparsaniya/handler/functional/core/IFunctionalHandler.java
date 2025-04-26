package io.github.rajparsaniya.handler.functional.core;

import io.github.rajparsaniya.function.functional.core.IBiConsumer;
import io.github.rajparsaniya.function.functional.core.IBiFunction;
import io.github.rajparsaniya.function.functional.core.IBiPredicate;
import io.github.rajparsaniya.function.functional.core.IBinaryOperator;
import io.github.rajparsaniya.function.functional.core.IBooleanSupplier;
import io.github.rajparsaniya.function.functional.core.IComparator;
import io.github.rajparsaniya.function.functional.core.IConsumer;
import io.github.rajparsaniya.function.functional.core.IDoubleBinaryOperator;
import io.github.rajparsaniya.function.functional.core.IDoubleConsumer;
import io.github.rajparsaniya.function.functional.core.IDoubleFunction;
import io.github.rajparsaniya.function.functional.core.IDoublePredicate;
import io.github.rajparsaniya.function.functional.core.IDoubleSupplier;
import io.github.rajparsaniya.function.functional.core.IDoubleToIntFunction;
import io.github.rajparsaniya.function.functional.core.IDoubleToLongFunction;
import io.github.rajparsaniya.function.functional.core.IDoubleUnaryOperator;
import io.github.rajparsaniya.function.functional.core.IFunction;
import io.github.rajparsaniya.function.functional.core.IIntBinaryOperator;
import io.github.rajparsaniya.function.functional.core.IIntConsumer;
import io.github.rajparsaniya.function.functional.core.IIntFunction;
import io.github.rajparsaniya.function.functional.core.IIntPredicate;
import io.github.rajparsaniya.function.functional.core.IIntSupplier;
import io.github.rajparsaniya.function.functional.core.IIntToDoubleFunction;
import io.github.rajparsaniya.function.functional.core.IIntToLongFunction;
import io.github.rajparsaniya.function.functional.core.IIntUnaryOperator;
import io.github.rajparsaniya.function.functional.core.ILongBinaryOperator;
import io.github.rajparsaniya.function.functional.core.ILongConsumer;
import io.github.rajparsaniya.function.functional.core.ILongFunction;
import io.github.rajparsaniya.function.functional.core.ILongPredicate;
import io.github.rajparsaniya.function.functional.core.ILongSupplier;
import io.github.rajparsaniya.function.functional.core.ILongToDoubleFunction;
import io.github.rajparsaniya.function.functional.core.ILongToIntFunction;
import io.github.rajparsaniya.function.functional.core.ILongUnaryOperator;
import io.github.rajparsaniya.function.functional.core.IObjDoubleConsumer;
import io.github.rajparsaniya.function.functional.core.IObjIntConsumer;
import io.github.rajparsaniya.function.functional.core.IObjLongConsumer;
import io.github.rajparsaniya.function.functional.core.IPredicate;
import io.github.rajparsaniya.function.functional.core.ISupplier;
import io.github.rajparsaniya.function.functional.core.IToDoubleBiFunction;
import io.github.rajparsaniya.function.functional.core.IToDoubleFunction;
import io.github.rajparsaniya.function.functional.core.IToIntBiFunction;
import io.github.rajparsaniya.function.functional.core.IToIntFunction;
import io.github.rajparsaniya.function.functional.core.IToLongBiFunction;
import io.github.rajparsaniya.function.functional.core.IToLongFunction;
import io.github.rajparsaniya.function.functional.core.IUnaryOperator;
import io.github.rajparsaniya.handler.functional.exception.IFunctionalExceptionHandler;
import io.github.rajparsaniya.handler.functional.index.IFunctionalIndexHandler;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

/**
 * The {@code IFunctionalHandler} interface provides a functional approach
 * to handle various Java functional interfaces by wrapping them with custom
 * functional implementations.
 *
 * <p>This interface acts as a bridge between standard Java functional interfaces
 * (such as {@link Supplier}, {@link Consumer}, {@link Function}, etc.) and
 * their corresponding custom functional interfaces (such as {@link ISupplier},
 * {@link IConsumer}, {@link IFunction}, etc.).
 *
 * @author Raj Parsaniya
 * @see IFunctionalExceptionHandler
 * @see IFunctionalIndexHandler
 * @since 1.0.0
 */
public interface IFunctionalHandler extends IBaseHandler {

    /**
     * Returns a {@link BooleanSupplier}
     *
     * @param booleanSupplier the supplier that provides a boolean value.
     * @return the {@link BooleanSupplier}
     * @since 1.0.0
     */
    BooleanSupplier booleanSupplier(final IBooleanSupplier booleanSupplier);

    /**
     * Returns a {@link IntSupplier}
     *
     * @param intSupplier the supplier that provides an integer value.
     * @return the {@link IntSupplier}
     * @since 1.0.0
     */
    IntSupplier intSupplier(final IIntSupplier intSupplier);

    /**
     * Returns a {@link IntConsumer}
     *
     * @param intConsumer the consumer that accepts an integer value.
     * @return the {@link IntConsumer}
     * @since 1.0.0
     */
    IntConsumer intConsumer(final IIntConsumer intConsumer);

    /**
     * Returns a {@link IntPredicate}
     *
     * @param intPredicate the predicate that tests an integer value.
     * @return the {@link IntPredicate}
     * @since 1.0.0
     */
    IntPredicate intPredicate(final IIntPredicate intPredicate);

    /**
     * Returns a {@link IntToLongFunction}
     *
     * @param intToLongFunction the function that converts an integer to a long.
     * @return the {@link IntToLongFunction}
     * @since 1.0.0
     */
    IntToLongFunction intToLongFunction(final IIntToLongFunction intToLongFunction);

    /**
     * Returns a {@link IntToDoubleFunction}
     *
     * @param intToDoubleFunction the function that converts an integer to a double.
     * @return the {@link IntToDoubleFunction}
     * @since 1.0.0
     */
    IntToDoubleFunction intToDoubleFunction(final IIntToDoubleFunction intToDoubleFunction);

    /**
     * Returns a {@link IntBinaryOperator}
     *
     * @param intBinaryOperator the operator that performs an operation on two integer operands.
     * @return the {@link IntBinaryOperator}
     * @since 1.0.0
     */
    IntBinaryOperator intBinaryOperator(final IIntBinaryOperator intBinaryOperator);

    /**
     * Returns a {@link IntUnaryOperator}
     *
     * @param intUnaryOperator the operator that performs an operation on a single integer operand.
     * @return the {@link IntUnaryOperator}
     * @since 1.0.0
     */
    IntUnaryOperator intUnaryOperator(final IIntUnaryOperator intUnaryOperator);

    /**
     * Returns a {@link LongSupplier}
     *
     * @param longSupplier the supplier that provides a long value.
     * @return the {@link LongSupplier}
     * @since 1.0.0
     */
    LongSupplier longSupplier(final ILongSupplier longSupplier);

    /**
     * Returns a {@link LongConsumer}
     *
     * @param longConsumer the consumer that accepts a long value.
     * @return the {@link LongConsumer}
     * @since 1.0.0
     */
    LongConsumer longConsumer(final ILongConsumer longConsumer);

    /**
     * Returns a {@link LongPredicate}
     *
     * @param longPredicate the predicate that tests a long value.
     * @return the {@link LongPredicate}
     * @since 1.0.0
     */
    LongPredicate longPredicate(final ILongPredicate longPredicate);

    /**
     * Returns a {@link LongToIntFunction}
     *
     * @param longToIntFunction the function that converts a long to an int.
     * @return the {@link LongToIntFunction}
     * @since 1.0.0
     */
    LongToIntFunction longToIntFunction(final ILongToIntFunction longToIntFunction);

    /**
     * Returns a {@link LongToDoubleFunction}
     *
     * @param longToDoubleFunction the function that converts a long to a double.
     * @return the {@link LongToDoubleFunction}
     * @since 1.0.0
     */
    LongToDoubleFunction longToDoubleFunction(final ILongToDoubleFunction longToDoubleFunction);

    /**
     * Returns a {@link LongBinaryOperator}
     *
     * @param longBinaryOperator the operator that applies a binary operation on two long values.
     * @return the {@link LongBinaryOperator}
     * @since 1.0.0
     */
    LongBinaryOperator longBinaryOperator(final ILongBinaryOperator longBinaryOperator);

    /**
     * Returns a {@link LongUnaryOperator}
     *
     * @param longUnaryOperator the operator that applies a unary operation on a long value.
     * @return the {@link LongUnaryOperator}
     * @since 1.0.0
     */
    LongUnaryOperator longUnaryOperator(final ILongUnaryOperator longUnaryOperator);

    /**
     * Returns a {@link DoubleSupplier}
     *
     * @param doubleSupplier the supplier that provides a double value.
     * @return the {@link DoubleSupplier}
     * @since 1.0.0
     */
    DoubleSupplier doubleSupplier(final IDoubleSupplier doubleSupplier);

    /**
     * Returns a {@link DoubleConsumer}
     *
     * @param doubleConsumer the consumer that accepts a double value.
     * @return the {@link DoubleConsumer}
     * @since 1.0.0
     */
    DoubleConsumer doubleConsumer(final IDoubleConsumer doubleConsumer);

    /**
     * Returns a {@link DoublePredicate}
     *
     * @param doublePredicate the predicate that tests a double value.
     * @return the {@link DoublePredicate}
     * @since 1.0.0
     */
    DoublePredicate doublePredicate(final IDoublePredicate doublePredicate);

    /**
     * Returns a {@link DoubleToIntFunction}
     *
     * @param doubleToIntFunction the function that converts a double to an int.
     * @return the {@link DoubleToIntFunction}
     * @since 1.0.0
     */
    DoubleToIntFunction doubleToIntFunction(final IDoubleToIntFunction doubleToIntFunction);

    /**
     * Returns a {@link DoubleToLongFunction}
     *
     * @param doubleToLongFunction the function that converts a double to a long.
     * @return the {@link DoubleToLongFunction}
     * @since 1.0.0
     */
    DoubleToLongFunction doubleToLongFunction(final IDoubleToLongFunction doubleToLongFunction);

    /**
     * Returns a {@link DoubleBinaryOperator}
     *
     * @param doubleBinaryOperator the operator that applies a binary operation on two double values.
     * @return the {@link DoubleBinaryOperator}
     * @since 1.0.0
     */
    DoubleBinaryOperator doubleBinaryOperator(final IDoubleBinaryOperator doubleBinaryOperator);

    /**
     * Returns a {@link DoubleUnaryOperator}
     *
     * @param doubleUnaryOperator the operator that applies a unary operation on a double value.
     * @return the {@link DoubleUnaryOperator}
     * @since 1.0.0
     */
    DoubleUnaryOperator doubleUnaryOperator(final IDoubleUnaryOperator doubleUnaryOperator);

    /**
     * Returns a {@link Supplier}
     *
     * @param supplier the supplier that provides a value.
     * @param <T>      the type of the result.
     * @return the {@link Supplier}
     * @since 1.0.0
     */
    <T> Supplier<T> supplier(final ISupplier<T> supplier);

    /**
     * Returns a {@link Consumer}
     *
     * @param consumer the consumer that accepts a value.
     * @param <T>      the type of the input.
     * @return the {@link Consumer}
     * @since 1.0.0
     */
    <T> Consumer<T> consumer(final IConsumer<T> consumer);

    /**
     * Returns a {@link Predicate}
     *
     * @param predicate the predicate that tests a value.
     * @param <T>       the type of the input.
     * @return the {@link Predicate}
     * @since 1.0.0
     */
    <T> Predicate<T> predicate(final IPredicate<T> predicate);

    /**
     * Returns a {@link Function}
     *
     * @param function the function that converts an input to an output.
     * @param <T>      the type of the input.
     * @param <R>      the type of the result.
     * @return the {@link Function}
     * @since 1.0.0
     */
    <T, R> Function<T, R> function(final IFunction<T, R> function);

    /**
     * Returns a {@link BiConsumer}
     *
     * @param biConsumer the consumer that accepts two values.
     * @param <T>        the type of the first input.
     * @param <U>        the type of the second input.
     * @return the {@link BiConsumer}
     * @since 1.0.0
     */
    <T, U> BiConsumer<T, U> biConsumer(final IBiConsumer<T, U> biConsumer);

    /**
     * Returns a {@link BiPredicate}
     *
     * @param biPredicate the predicate that tests two values.
     * @param <T>         the type of the first input.
     * @param <U>         the type of the second input.
     * @return the {@link BiPredicate}
     * @since 1.0.0
     */
    <T, U> BiPredicate<T, U> biPredicate(final IBiPredicate<T, U> biPredicate);

    /**
     * Returns a {@link BiFunction}
     *
     * @param biFunction the function that converts two inputs to an output.
     * @param <T>        the type of the first input.
     * @param <U>        the type of the second input.
     * @param <R>        the type of the result.
     * @return the {@link BiFunction}
     * @since 1.0.0
     */
    <T, U, R> BiFunction<T, U, R> biFunction(final IBiFunction<T, U, R> biFunction);

    /**
     * Returns a {@link BinaryOperator}
     *
     * @param binaryOperator the operator that applies a binary operation on two values.
     * @param <T>            the type of the input and output.
     * @return the {@link BinaryOperator}
     * @since 1.0.0
     */
    <T> BinaryOperator<T> binaryOperator(final IBinaryOperator<T> binaryOperator);

    /**
     * Returns a {@link ToIntFunction}
     *
     * @param toIntFunction the function that converts an input to an int value.
     * @param <T>           the type of the input.
     * @return the {@link ToIntFunction}
     * @since 1.0.0
     */
    <T> ToIntFunction<T> toIntFunction(final IToIntFunction<T> toIntFunction);

    /**
     * Returns a {@link ToLongFunction}
     *
     * @param toLongFunction the function that converts an input to a long value.
     * @param <T>            the type of the input.
     * @return the {@link ToLongFunction}
     * @since 1.0.0
     */
    <T> ToLongFunction<T> toLongFunction(final IToLongFunction<T> toLongFunction);

    /**
     * Returns a {@link ToDoubleFunction}
     *
     * @param toDoubleFunction the function that converts an input to a double value.
     * @param <T>              the type of the input.
     * @return the {@link ToDoubleFunction}
     * @since 1.0.0
     */
    <T> ToDoubleFunction<T> toDoubleFunction(final IToDoubleFunction<T> toDoubleFunction);

    /**
     * Returns a {@link ToIntBiFunction}
     *
     * @param toIntBiFunction the function that converts two inputs to an int value.
     * @param <T>             the type of the first input.
     * @param <U>             the type of the second input.
     * @return the {@link ToIntBiFunction}
     * @since 1.0.0
     */
    <T, U> ToIntBiFunction<T, U> toIntBiFunction(final IToIntBiFunction<T, U> toIntBiFunction);

    /**
     * Returns a {@link ToLongBiFunction}
     *
     * @param toLongBiFunction the function that converts two inputs to a long value.
     * @param <T>              the type of the first input.
     * @param <U>              the type of the second input.
     * @return the {@link ToLongBiFunction}
     * @since 1.0.0
     */
    <T, U> ToLongBiFunction<T, U> toLongBiFunction(final IToLongBiFunction<T, U> toLongBiFunction);

    /**
     * Returns a {@link ToDoubleBiFunction}
     *
     * @param toDoubleBiFunction the function that converts two inputs to a double value.
     * @param <T>                the type of the first input.
     * @param <U>                the type of the second input.
     * @return the {@link ToDoubleBiFunction}
     * @since 1.0.0
     */
    <T, U> ToDoubleBiFunction<T, U> toDoubleBiFunction(final IToDoubleBiFunction<T, U> toDoubleBiFunction);

    /**
     * Returns a {@link IntFunction}
     *
     * @param intFunction the function that converts an int value to a result.
     * @param <R>         the type of the result.
     * @return the {@link IntFunction}
     * @since 1.0.0
     */
    <R> IntFunction<R> intFunction(final IIntFunction<R> intFunction);

    /**
     * Returns a {@link LongFunction}
     *
     * @param longFunction the function that converts a long value to a result.
     * @param <R>          the type of the result.
     * @return the {@link LongFunction}
     * @since 1.0.0
     */
    <R> LongFunction<R> longFunction(final ILongFunction<R> longFunction);

    /**
     * Returns a {@link DoubleFunction}
     *
     * @param doubleFunction the function that converts a double value to a result.
     * @param <R>            the type of the result.
     * @return the {@link DoubleFunction}
     * @since 1.0.0
     */
    <R> DoubleFunction<R> doubleFunction(final IDoubleFunction<R> doubleFunction);

    /**
     * Returns a {@link ObjIntConsumer}
     *
     * @param objIntConsumer the consumer that accepts an object and an int value.
     * @param <T>            the type of the object.
     * @return the {@link ObjIntConsumer}
     * @since 1.0.0
     */
    <T> ObjIntConsumer<T> objIntConsumer(final IObjIntConsumer<T> objIntConsumer);

    /**
     * Returns a {@link ObjLongConsumer}
     *
     * @param objLongConsumer the consumer that accepts an object and a long value.
     * @param <T>             the type of the object.
     * @return the {@link ObjLongConsumer}
     * @since 1.0.0
     */
    <T> ObjLongConsumer<T> objLongConsumer(final IObjLongConsumer<T> objLongConsumer);

    /**
     * Returns a {@link ObjDoubleConsumer}
     *
     * @param objDoubleConsumer the consumer that accepts an object and a double value.
     * @param <T>               the type of the object.
     * @return the {@link ObjDoubleConsumer}
     * @since 1.0.0
     */
    <T> ObjDoubleConsumer<T> objDoubleConsumer(final IObjDoubleConsumer<T> objDoubleConsumer);

    /**
     * Returns a {@link IUnaryOperator}
     *
     * @param unaryOperator the operator that applies a unary operation on a value.
     * @param <T>           the type of the input and output.
     * @return the {@link IUnaryOperator}
     * @since 1.0.0
     */
    <T> UnaryOperator<T> unaryOperator(final IUnaryOperator<T> unaryOperator);

    /**
     * Returns a {@link Comparator}
     *
     * @param comparator the comparator that compares two values of type {@code T}.
     * @param <T>        the type of objects that may be compared.
     * @return the {@link Comparator}
     * @since 1.0.0
     */
    <T> Comparator<T> comparator(final IComparator<T> comparator);
}
