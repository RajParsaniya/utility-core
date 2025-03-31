package io.github.rajparsaniya.handler.core;

import io.github.rajparsaniya.function.core.IBiConsumer;
import io.github.rajparsaniya.function.core.IBiFunction;
import io.github.rajparsaniya.function.core.IBiPredicate;
import io.github.rajparsaniya.function.core.IBinaryOperator;
import io.github.rajparsaniya.function.core.IBooleanSupplier;
import io.github.rajparsaniya.function.core.IComparator;
import io.github.rajparsaniya.function.core.IConsumer;
import io.github.rajparsaniya.function.core.IDoubleBinaryOperator;
import io.github.rajparsaniya.function.core.IDoubleConsumer;
import io.github.rajparsaniya.function.core.IDoubleFunction;
import io.github.rajparsaniya.function.core.IDoublePredicate;
import io.github.rajparsaniya.function.core.IDoubleSupplier;
import io.github.rajparsaniya.function.core.IDoubleToIntFunction;
import io.github.rajparsaniya.function.core.IDoubleToLongFunction;
import io.github.rajparsaniya.function.core.IDoubleUnaryOperator;
import io.github.rajparsaniya.function.core.IFunction;
import io.github.rajparsaniya.function.core.IIntBinaryOperator;
import io.github.rajparsaniya.function.core.IIntConsumer;
import io.github.rajparsaniya.function.core.IIntFunction;
import io.github.rajparsaniya.function.core.IIntPredicate;
import io.github.rajparsaniya.function.core.IIntSupplier;
import io.github.rajparsaniya.function.core.IIntToDoubleFunction;
import io.github.rajparsaniya.function.core.IIntToLongFunction;
import io.github.rajparsaniya.function.core.IIntUnaryOperator;
import io.github.rajparsaniya.function.core.ILongBinaryOperator;
import io.github.rajparsaniya.function.core.ILongConsumer;
import io.github.rajparsaniya.function.core.ILongFunction;
import io.github.rajparsaniya.function.core.ILongPredicate;
import io.github.rajparsaniya.function.core.ILongSupplier;
import io.github.rajparsaniya.function.core.ILongToDoubleFunction;
import io.github.rajparsaniya.function.core.ILongToIntFunction;
import io.github.rajparsaniya.function.core.ILongUnaryOperator;
import io.github.rajparsaniya.function.core.IObjDoubleConsumer;
import io.github.rajparsaniya.function.core.IObjIntConsumer;
import io.github.rajparsaniya.function.core.IObjLongConsumer;
import io.github.rajparsaniya.function.core.IPredicate;
import io.github.rajparsaniya.function.core.ISupplier;
import io.github.rajparsaniya.function.core.IToDoubleBiFunction;
import io.github.rajparsaniya.function.core.IToDoubleFunction;
import io.github.rajparsaniya.function.core.IToIntBiFunction;
import io.github.rajparsaniya.function.core.IToIntFunction;
import io.github.rajparsaniya.function.core.IToLongBiFunction;
import io.github.rajparsaniya.function.core.IToLongFunction;
import io.github.rajparsaniya.function.core.IUnaryOperator;

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

public interface IFunctionalHandler extends IBaseHandler {
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
