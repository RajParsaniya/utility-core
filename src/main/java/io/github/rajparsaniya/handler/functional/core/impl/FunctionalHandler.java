package io.github.rajparsaniya.handler.functional.core.impl;

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
import io.github.rajparsaniya.handler.functional.core.IFunctionalHandler;

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
 * The {@code FunctionalHandler} class provides an implementation of the
 * {@link IFunctionalHandler} interface.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class FunctionalHandler extends BaseHandler implements IFunctionalHandler {

    /**
     * Constructs a {@code FunctionalHandler} with a default behaviour.
     *
     * @since 1.0.0
     */
    public FunctionalHandler() {
    }

    @Override
    public BooleanSupplier booleanSupplier(final IBooleanSupplier booleanSupplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> {
            try {
                return booleanSupplier.getAsBoolean(atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntSupplier intSupplier(final IIntSupplier intSupplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> {
            try {
                return intSupplier.getAsInt(atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntConsumer intConsumer(final IIntConsumer intConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                intConsumer.accept(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntPredicate intPredicate(final IIntPredicate intPredicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return intPredicate.test(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntToLongFunction intToLongFunction(final IIntToLongFunction intToLongFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return intToLongFunction.applyAsLong(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntToDoubleFunction intToDoubleFunction(final IIntToDoubleFunction intToDoubleFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return intToDoubleFunction.applyAsDouble(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntBinaryOperator intBinaryOperator(final IIntBinaryOperator intBinaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (left, right) -> {
            try {
                return intBinaryOperator.applyAsInt(left, right, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntUnaryOperator intUnaryOperator(final IIntUnaryOperator intUnaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return operand -> {
            try {
                return intUnaryOperator.applyAsInt(operand, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongSupplier longSupplier(final ILongSupplier longSupplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> {
            try {
                return longSupplier.getAsLong(atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongConsumer longConsumer(final ILongConsumer longConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                longConsumer.accept(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongPredicate longPredicate(final ILongPredicate longPredicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return longPredicate.test(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongToIntFunction longToIntFunction(final ILongToIntFunction longToIntFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return longToIntFunction.applyAsInt(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongToDoubleFunction longToDoubleFunction(final ILongToDoubleFunction longToDoubleFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return longToDoubleFunction.applyAsDouble(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongBinaryOperator longBinaryOperator(final ILongBinaryOperator longBinaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (left, right) -> {
            try {
                return longBinaryOperator.applyAsLong(left, right, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongUnaryOperator longUnaryOperator(final ILongUnaryOperator longUnaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return operand -> {
            try {
                return longUnaryOperator.applyAsLong(operand, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleSupplier doubleSupplier(final IDoubleSupplier doubleSupplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> {
            try {
                return doubleSupplier.getAsDouble(atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleConsumer doubleConsumer(final IDoubleConsumer doubleConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                doubleConsumer.accept(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoublePredicate doublePredicate(final IDoublePredicate doublePredicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return doublePredicate.test(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleToIntFunction doubleToIntFunction(final IDoubleToIntFunction doubleToIntFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return doubleToIntFunction.applyAsInt(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleToLongFunction doubleToLongFunction(final IDoubleToLongFunction doubleToLongFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return doubleToLongFunction.applyAsLong(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleBinaryOperator doubleBinaryOperator(final IDoubleBinaryOperator doubleBinaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (left, right) -> {
            try {
                return doubleBinaryOperator.applyAsDouble(left, right, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleUnaryOperator doubleUnaryOperator(final IDoubleUnaryOperator doubleUnaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return operand -> {
            try {
                return doubleUnaryOperator.applyAsDouble(operand, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Supplier<T> supplier(final ISupplier<T> supplier) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return () -> {
            try {
                return supplier.get(atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Consumer<T> consumer(final IConsumer<T> consumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> {
            try {
                consumer.accept(t, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Predicate<T> predicate(final IPredicate<T> predicate) {
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
    public <T, R> Function<T, R> function(final IFunction<T, R> function) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> {
            try {
                return function.apply(t, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> BiConsumer<T, U> biConsumer(final IBiConsumer<T, U> biConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> {
            try {
                biConsumer.accept(t, u, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> BiPredicate<T, U> biPredicate(final IBiPredicate<T, U> biPredicate) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> {
            try {
                return biPredicate.test(t, u, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U, R> BiFunction<T, U, R> biFunction(final IBiFunction<T, U, R> biFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> {
            try {
                return biFunction.apply(t, u, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> BinaryOperator<T> binaryOperator(final IBinaryOperator<T> binaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> {
            try {
                return binaryOperator.apply(t, u, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToIntFunction<T> toIntFunction(final IToIntFunction<T> toIntFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return toIntFunction.applyAsInt(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToLongFunction<T> toLongFunction(final IToLongFunction<T> toLongFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return toLongFunction.applyAsLong(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToDoubleFunction<T> toDoubleFunction(final IToDoubleFunction<T> toDoubleFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return toDoubleFunction.applyAsDouble(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> ToIntBiFunction<T, U> toIntBiFunction(final IToIntBiFunction<T, U> toIntBiFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> {
            try {
                return toIntBiFunction.applyAsInt(t, u, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> ToLongBiFunction<T, U> toLongBiFunction(final IToLongBiFunction<T, U> toLongBiFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> {
            try {
                return toLongBiFunction.applyAsLong(t, u, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> ToDoubleBiFunction<T, U> toDoubleBiFunction(final IToDoubleBiFunction<T, U> toDoubleBiFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, u) -> {
            try {
                return toDoubleBiFunction.applyAsDouble(t, u, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <R> IntFunction<R> intFunction(final IIntFunction<R> intFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return intFunction.apply(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <R> LongFunction<R> longFunction(final ILongFunction<R> longFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return longFunction.apply(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <R> DoubleFunction<R> doubleFunction(final IDoubleFunction<R> doubleFunction) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return value -> {
            try {
                return doubleFunction.apply(value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ObjIntConsumer<T> objIntConsumer(final IObjIntConsumer<T> objIntConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, value) -> {
            try {
                objIntConsumer.accept(t, value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ObjLongConsumer<T> objLongConsumer(final IObjLongConsumer<T> objLongConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, value) -> {
            try {
                objLongConsumer.accept(t, value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ObjDoubleConsumer<T> objDoubleConsumer(final IObjDoubleConsumer<T> objDoubleConsumer) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return (t, value) -> {
            try {
                objDoubleConsumer.accept(t, value, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> UnaryOperator<T> unaryOperator(final IUnaryOperator<T> unaryOperator) {
        final AtomicInteger atomicInteger = new AtomicInteger(super.initialIndex());
        return t -> {
            try {
                return unaryOperator.apply(t, atomicInteger.getAndIncrement());
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Comparator<T> comparator(final IComparator<T> comparator) {
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
}
