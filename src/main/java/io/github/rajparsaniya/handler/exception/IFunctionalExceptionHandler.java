package io.github.rajparsaniya.handler.exception;

import io.github.rajparsaniya.function.exception.IBiConsumer;
import io.github.rajparsaniya.function.exception.IBiFunction;
import io.github.rajparsaniya.function.exception.IBiPredicate;
import io.github.rajparsaniya.function.exception.IBinaryOperator;
import io.github.rajparsaniya.function.exception.IBooleanSupplier;
import io.github.rajparsaniya.function.exception.IComparator;
import io.github.rajparsaniya.function.exception.IConsumer;
import io.github.rajparsaniya.function.exception.IDoubleBinaryOperator;
import io.github.rajparsaniya.function.exception.IDoubleConsumer;
import io.github.rajparsaniya.function.exception.IDoubleFunction;
import io.github.rajparsaniya.function.exception.IDoublePredicate;
import io.github.rajparsaniya.function.exception.IDoubleSupplier;
import io.github.rajparsaniya.function.exception.IDoubleToIntFunction;
import io.github.rajparsaniya.function.exception.IDoubleToLongFunction;
import io.github.rajparsaniya.function.exception.IDoubleUnaryOperator;
import io.github.rajparsaniya.function.exception.IFunction;
import io.github.rajparsaniya.function.exception.IIntBinaryOperator;
import io.github.rajparsaniya.function.exception.IIntConsumer;
import io.github.rajparsaniya.function.exception.IIntFunction;
import io.github.rajparsaniya.function.exception.IIntPredicate;
import io.github.rajparsaniya.function.exception.IIntSupplier;
import io.github.rajparsaniya.function.exception.IIntToDoubleFunction;
import io.github.rajparsaniya.function.exception.IIntToLongFunction;
import io.github.rajparsaniya.function.exception.IIntUnaryOperator;
import io.github.rajparsaniya.function.exception.ILongBinaryOperator;
import io.github.rajparsaniya.function.exception.ILongConsumer;
import io.github.rajparsaniya.function.exception.ILongFunction;
import io.github.rajparsaniya.function.exception.ILongPredicate;
import io.github.rajparsaniya.function.exception.ILongSupplier;
import io.github.rajparsaniya.function.exception.ILongToDoubleFunction;
import io.github.rajparsaniya.function.exception.ILongToIntFunction;
import io.github.rajparsaniya.function.exception.ILongUnaryOperator;
import io.github.rajparsaniya.function.exception.IObjDoubleConsumer;
import io.github.rajparsaniya.function.exception.IObjIntConsumer;
import io.github.rajparsaniya.function.exception.IObjLongConsumer;
import io.github.rajparsaniya.function.exception.IPredicate;
import io.github.rajparsaniya.function.exception.ISupplier;
import io.github.rajparsaniya.function.exception.IToDoubleBiFunction;
import io.github.rajparsaniya.function.exception.IToDoubleFunction;
import io.github.rajparsaniya.function.exception.IToIntBiFunction;
import io.github.rajparsaniya.function.exception.IToIntFunction;
import io.github.rajparsaniya.function.exception.IToLongBiFunction;
import io.github.rajparsaniya.function.exception.IToLongFunction;
import io.github.rajparsaniya.function.exception.IUnaryOperator;

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

public interface IFunctionalExceptionHandler extends IBaseExceptionHandler {
    BooleanSupplier booleanSupplier(final IBooleanSupplier booleanSupplier);

    IntSupplier intSupplier(final IIntSupplier intSupplier);

    IntConsumer intConsumer(final IIntConsumer intConsumer);

    IntPredicate intPredicate(final IIntPredicate intPredicate);

    IntToLongFunction intToLongFunction(final IIntToLongFunction intToLongFunction);

    IntToDoubleFunction intToDoubleFunction(final IIntToDoubleFunction intToDoubleFunction);

    IntBinaryOperator intBinaryOperator(final IIntBinaryOperator intBinaryOperator);

    IntUnaryOperator intUnaryOperator(final IIntUnaryOperator intUnaryOperator);

    LongSupplier longSupplier(final ILongSupplier longSupplier);

    LongConsumer longConsumer(final ILongConsumer longConsumer);

    LongPredicate longPredicate(final ILongPredicate longPredicate);

    LongToIntFunction longToIntFunction(final ILongToIntFunction longToIntFunction);

    LongToDoubleFunction longToDoubleFunction(final ILongToDoubleFunction longToDoubleFunction);

    LongBinaryOperator longBinaryOperator(final ILongBinaryOperator longBinaryOperator);

    LongUnaryOperator longUnaryOperator(final ILongUnaryOperator longUnaryOperator);

    DoubleSupplier doubleSupplier(final IDoubleSupplier doubleSupplier);

    DoubleConsumer doubleConsumer(final IDoubleConsumer doubleConsumer);

    DoublePredicate doublePredicate(final IDoublePredicate doublePredicate);

    DoubleToIntFunction doubleToIntFunction(final IDoubleToIntFunction doubleToIntFunction);

    DoubleToLongFunction doubleToLongFunction(final IDoubleToLongFunction doubleToLongFunction);

    DoubleBinaryOperator doubleBinaryOperator(final IDoubleBinaryOperator doubleBinaryOperator);

    DoubleUnaryOperator doubleUnaryOperator(final IDoubleUnaryOperator doubleUnaryOperator);

    <T> Supplier<T> supplier(final ISupplier<T> supplier);

    <T> Consumer<T> consumer(final IConsumer<T> consumer);

    <T> Predicate<T> predicate(final IPredicate<T> predicate);

    <T, R> Function<T, R> function(final IFunction<T, R> function);

    <T, U> BiConsumer<T, U> biConsumer(final IBiConsumer<T, U> biConsumer);

    <T, U> BiPredicate<T, U> biPredicate(final IBiPredicate<T, U> biPredicate);

    <T, U, R> BiFunction<T, U, R> biFunction(final IBiFunction<T, U, R> biFunction);

    <T> BinaryOperator<T> binaryOperator(final IBinaryOperator<T> binaryOperator);

    <T> ToIntFunction<T> toIntFunction(final IToIntFunction<T> toIntFunction);

    <T> ToLongFunction<T> toLongFunction(final IToLongFunction<T> toLongFunction);

    <T> ToDoubleFunction<T> toDoubleFunction(final IToDoubleFunction<T> toDoubleFunction);

    <T, U> ToIntBiFunction<T, U> toIntBiFunction(final IToIntBiFunction<T, U> toIntBiFunction);

    <T, U> ToLongBiFunction<T, U> toLongBiFunction(final IToLongBiFunction<T, U> toLongBiFunction);

    <T, U> ToDoubleBiFunction<T, U> toDoubleBiFunction(final IToDoubleBiFunction<T, U> toDoubleBiFunction);

    <R> IntFunction<R> intFunction(final IIntFunction<R> intFunction);

    <R> LongFunction<R> longFunction(final ILongFunction<R> longFunction);

    <R> DoubleFunction<R> doubleFunction(final IDoubleFunction<R> doubleFunction);

    <T> ObjIntConsumer<T> objIntConsumer(final IObjIntConsumer<T> objIntConsumer);

    <T> ObjLongConsumer<T> objLongConsumer(final IObjLongConsumer<T> objLongConsumer);

    <T> ObjDoubleConsumer<T> objDoubleConsumer(final IObjDoubleConsumer<T> objDoubleConsumer);

    <T> UnaryOperator<T> unaryOperator(final IUnaryOperator<T> unaryOperator);

    <T> Comparator<T> comparator(final IComparator<T> comparator);
}
