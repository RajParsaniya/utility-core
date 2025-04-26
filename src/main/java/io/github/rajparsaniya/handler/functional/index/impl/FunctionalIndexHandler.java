package io.github.rajparsaniya.handler.functional.index.impl;

import io.github.rajparsaniya.function.functional.index.IBiConsumer;
import io.github.rajparsaniya.function.functional.index.IBiFunction;
import io.github.rajparsaniya.function.functional.index.IBiPredicate;
import io.github.rajparsaniya.function.functional.index.IBinaryOperator;
import io.github.rajparsaniya.function.functional.index.IBooleanSupplier;
import io.github.rajparsaniya.function.functional.index.IComparator;
import io.github.rajparsaniya.function.functional.index.IConsumer;
import io.github.rajparsaniya.function.functional.index.IDoubleBinaryOperator;
import io.github.rajparsaniya.function.functional.index.IDoubleConsumer;
import io.github.rajparsaniya.function.functional.index.IDoubleFunction;
import io.github.rajparsaniya.function.functional.index.IDoublePredicate;
import io.github.rajparsaniya.function.functional.index.IDoubleSupplier;
import io.github.rajparsaniya.function.functional.index.IDoubleToIntFunction;
import io.github.rajparsaniya.function.functional.index.IDoubleToLongFunction;
import io.github.rajparsaniya.function.functional.index.IDoubleUnaryOperator;
import io.github.rajparsaniya.function.functional.index.IFunction;
import io.github.rajparsaniya.function.functional.index.IIntBinaryOperator;
import io.github.rajparsaniya.function.functional.index.IIntConsumer;
import io.github.rajparsaniya.function.functional.index.IIntFunction;
import io.github.rajparsaniya.function.functional.index.IIntPredicate;
import io.github.rajparsaniya.function.functional.index.IIntSupplier;
import io.github.rajparsaniya.function.functional.index.IIntToDoubleFunction;
import io.github.rajparsaniya.function.functional.index.IIntToLongFunction;
import io.github.rajparsaniya.function.functional.index.IIntUnaryOperator;
import io.github.rajparsaniya.function.functional.index.ILongBinaryOperator;
import io.github.rajparsaniya.function.functional.index.ILongConsumer;
import io.github.rajparsaniya.function.functional.index.ILongFunction;
import io.github.rajparsaniya.function.functional.index.ILongPredicate;
import io.github.rajparsaniya.function.functional.index.ILongSupplier;
import io.github.rajparsaniya.function.functional.index.ILongToDoubleFunction;
import io.github.rajparsaniya.function.functional.index.ILongToIntFunction;
import io.github.rajparsaniya.function.functional.index.ILongUnaryOperator;
import io.github.rajparsaniya.function.functional.index.IObjDoubleConsumer;
import io.github.rajparsaniya.function.functional.index.IObjIntConsumer;
import io.github.rajparsaniya.function.functional.index.IObjLongConsumer;
import io.github.rajparsaniya.function.functional.index.IPredicate;
import io.github.rajparsaniya.function.functional.index.ISupplier;
import io.github.rajparsaniya.function.functional.index.IToDoubleBiFunction;
import io.github.rajparsaniya.function.functional.index.IToDoubleFunction;
import io.github.rajparsaniya.function.functional.index.IToIntBiFunction;
import io.github.rajparsaniya.function.functional.index.IToIntFunction;
import io.github.rajparsaniya.function.functional.index.IToLongBiFunction;
import io.github.rajparsaniya.function.functional.index.IToLongFunction;
import io.github.rajparsaniya.function.functional.index.IUnaryOperator;
import io.github.rajparsaniya.handler.functional.index.IFunctionalIndexHandler;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
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
 * The {@code FunctionalIndexHandler} class provides an implementation of the
 * {@link IFunctionalIndexHandler} interface.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class FunctionalIndexHandler extends BaseIndexHandler implements IFunctionalIndexHandler {

    /**
     * Constructs a {@code FunctionalIndexHandler} with a default behaviour.
     *
     * @since 1.0.0
     */
    public FunctionalIndexHandler() {
    }

    /**
     * Constructs a {@code FunctionalIndexHandler} with a specified initial index.
     *
     * @param initialIndex the initial index value to be set.
     */
    public FunctionalIndexHandler(final Integer initialIndex) {
        super(initialIndex);
    }

    @Override
    public BooleanSupplier booleanSupplier(final IBooleanSupplier booleanSupplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> booleanSupplier.getAsBoolean(atomicInteger.getAndIncrement());
    }

    @Override
    public IntSupplier intSupplier(final IIntSupplier intSupplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> intSupplier.getAsInt(atomicInteger.getAndIncrement());
    }

    @Override
    public IntConsumer intConsumer(final IIntConsumer intConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> intConsumer.accept(value, atomicInteger.getAndIncrement());
    }

    @Override
    public IntPredicate intPredicate(final IIntPredicate intPredicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> intPredicate.test(value, atomicInteger.getAndIncrement());
    }

    @Override
    public IntToLongFunction intToLongFunction(final IIntToLongFunction intToLongFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> intToLongFunction.applyAsLong(value, atomicInteger.getAndIncrement());
    }

    @Override
    public IntToDoubleFunction intToDoubleFunction(final IIntToDoubleFunction intToDoubleFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> intToDoubleFunction.applyAsDouble(value, atomicInteger.getAndIncrement());
    }

    @Override
    public IntBinaryOperator intBinaryOperator(final IIntBinaryOperator intBinaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (left, right) -> intBinaryOperator.applyAsInt(left, right, atomicInteger.getAndIncrement());
    }

    @Override
    public IntUnaryOperator intUnaryOperator(final IIntUnaryOperator intUnaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return operand -> intUnaryOperator.applyAsInt(operand, atomicInteger.getAndIncrement());
    }

    @Override
    public LongSupplier longSupplier(final ILongSupplier longSupplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> longSupplier.getAsLong(atomicInteger.getAndIncrement());
    }

    @Override
    public LongConsumer longConsumer(final ILongConsumer longConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> longConsumer.accept(value, atomicInteger.getAndIncrement());
    }

    @Override
    public LongPredicate longPredicate(final ILongPredicate longPredicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> longPredicate.test(value, atomicInteger.getAndIncrement());
    }

    @Override
    public LongToIntFunction longToIntFunction(final ILongToIntFunction longToIntFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> longToIntFunction.applyAsInt(value, atomicInteger.getAndIncrement());
    }

    @Override
    public LongToDoubleFunction longToDoubleFunction(final ILongToDoubleFunction longToDoubleFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> longToDoubleFunction.applyAsDouble(value, atomicInteger.getAndIncrement());
    }

    @Override
    public LongBinaryOperator longBinaryOperator(final ILongBinaryOperator longBinaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (left, right) -> longBinaryOperator.applyAsLong(left, right, atomicInteger.getAndIncrement());
    }

    @Override
    public LongUnaryOperator longUnaryOperator(final ILongUnaryOperator longUnaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return operand -> longUnaryOperator.applyAsLong(operand, atomicInteger.getAndIncrement());
    }

    @Override
    public DoubleSupplier doubleSupplier(final IDoubleSupplier doubleSupplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> doubleSupplier.getAsDouble(atomicInteger.getAndIncrement());
    }

    @Override
    public DoubleConsumer doubleConsumer(final IDoubleConsumer doubleConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> doubleConsumer.accept(value, atomicInteger.getAndIncrement());
    }

    @Override
    public DoublePredicate doublePredicate(final IDoublePredicate doublePredicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> doublePredicate.test(value, atomicInteger.getAndIncrement());
    }

    @Override
    public DoubleToIntFunction doubleToIntFunction(final IDoubleToIntFunction doubleToIntFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> doubleToIntFunction.applyAsInt(value, atomicInteger.getAndIncrement());
    }

    @Override
    public DoubleToLongFunction doubleToLongFunction(final IDoubleToLongFunction doubleToLongFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> doubleToLongFunction.applyAsLong(value, atomicInteger.getAndIncrement());
    }

    @Override
    public DoubleBinaryOperator doubleBinaryOperator(final IDoubleBinaryOperator doubleBinaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (left, right) -> doubleBinaryOperator.applyAsDouble(left, right, atomicInteger.getAndIncrement());
    }

    @Override
    public DoubleUnaryOperator doubleUnaryOperator(final IDoubleUnaryOperator doubleUnaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return operand -> doubleUnaryOperator.applyAsDouble(operand, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Supplier<T> supplier(final ISupplier<T> supplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> supplier.get(atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Consumer<T> consumer(final IConsumer<T> consumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> consumer.accept(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Predicate<T> predicate(final IPredicate<T> predicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> predicate.test(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, R> Function<T, R> function(final IFunction<T, R> function) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> function.apply(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, U> BiConsumer<T, U> biConsumer(final IBiConsumer<T, U> biConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> biConsumer.accept(t, u, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, U> BiPredicate<T, U> biPredicate(final IBiPredicate<T, U> biPredicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> biPredicate.test(t, u, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, U, R> BiFunction<T, U, R> biFunction(final IBiFunction<T, U, R> biFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> biFunction.apply(t, u, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> BinaryOperator<T> binaryOperator(final IBinaryOperator<T> binaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> binaryOperator.apply(t, u, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> ToIntFunction<T> toIntFunction(final IToIntFunction<T> toIntFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> toIntFunction.applyAsInt(value, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> ToLongFunction<T> toLongFunction(final IToLongFunction<T> toLongFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> toLongFunction.applyAsLong(value, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> ToDoubleFunction<T> toDoubleFunction(final IToDoubleFunction<T> toDoubleFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> toDoubleFunction.applyAsDouble(value, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, U> ToIntBiFunction<T, U> toIntBiFunction(final IToIntBiFunction<T, U> toIntBiFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> toIntBiFunction.applyAsInt(t, u, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, U> ToLongBiFunction<T, U> toLongBiFunction(final IToLongBiFunction<T, U> toLongBiFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> toLongBiFunction.applyAsLong(t, u, atomicInteger.getAndIncrement());
    }

    @Override
    public <T, U> ToDoubleBiFunction<T, U> toDoubleBiFunction(final IToDoubleBiFunction<T, U> toDoubleBiFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> toDoubleBiFunction.applyAsDouble(t, u, atomicInteger.getAndIncrement());
    }

    @Override
    public <R> IntFunction<R> intFunction(final IIntFunction<R> intFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> intFunction.apply(value, atomicInteger.getAndIncrement());
    }

    @Override
    public <R> LongFunction<R> longFunction(final ILongFunction<R> longFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> longFunction.apply(value, atomicInteger.getAndIncrement());
    }

    @Override
    public <R> DoubleFunction<R> doubleFunction(final IDoubleFunction<R> doubleFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> doubleFunction.apply(value, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> ObjIntConsumer<T> objIntConsumer(final IObjIntConsumer<T> objIntConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, value) -> objIntConsumer.accept(t, value, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> ObjLongConsumer<T> objLongConsumer(final IObjLongConsumer<T> objLongConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, value) -> objLongConsumer.accept(t, value, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> ObjDoubleConsumer<T> objDoubleConsumer(final IObjDoubleConsumer<T> objDoubleConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, value) -> objDoubleConsumer.accept(t, value, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> UnaryOperator<T> unaryOperator(final IUnaryOperator<T> unaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> unaryOperator.apply(t, atomicInteger.getAndIncrement());
    }

    @Override
    public <T> Comparator<T> comparator(final IComparator<T> comparator) {
        final AtomicInteger atomicInteger1 = new AtomicInteger(super.initialIndex() + 1);
        final AtomicInteger atomicInteger2 = new AtomicInteger(super.initialIndex());
        return (o1, o2) -> comparator.compare(o1, o2, atomicInteger1.getAndIncrement(), atomicInteger2.getAndIncrement());
    }
}
