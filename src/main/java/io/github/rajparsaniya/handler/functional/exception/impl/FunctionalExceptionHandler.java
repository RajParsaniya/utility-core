package io.github.rajparsaniya.handler.functional.exception.impl;

import io.github.rajparsaniya.exception.handler.FunctionalHandlerException;
import io.github.rajparsaniya.function.functional.exception.IBiConsumer;
import io.github.rajparsaniya.function.functional.exception.IBiFunction;
import io.github.rajparsaniya.function.functional.exception.IBiPredicate;
import io.github.rajparsaniya.function.functional.exception.IBinaryOperator;
import io.github.rajparsaniya.function.functional.exception.IBooleanSupplier;
import io.github.rajparsaniya.function.functional.exception.IComparator;
import io.github.rajparsaniya.function.functional.exception.IConsumer;
import io.github.rajparsaniya.function.functional.exception.IDoubleBinaryOperator;
import io.github.rajparsaniya.function.functional.exception.IDoubleConsumer;
import io.github.rajparsaniya.function.functional.exception.IDoubleFunction;
import io.github.rajparsaniya.function.functional.exception.IDoublePredicate;
import io.github.rajparsaniya.function.functional.exception.IDoubleSupplier;
import io.github.rajparsaniya.function.functional.exception.IDoubleToIntFunction;
import io.github.rajparsaniya.function.functional.exception.IDoubleToLongFunction;
import io.github.rajparsaniya.function.functional.exception.IDoubleUnaryOperator;
import io.github.rajparsaniya.function.functional.exception.IFunction;
import io.github.rajparsaniya.function.functional.exception.IIntBinaryOperator;
import io.github.rajparsaniya.function.functional.exception.IIntConsumer;
import io.github.rajparsaniya.function.functional.exception.IIntFunction;
import io.github.rajparsaniya.function.functional.exception.IIntPredicate;
import io.github.rajparsaniya.function.functional.exception.IIntSupplier;
import io.github.rajparsaniya.function.functional.exception.IIntToDoubleFunction;
import io.github.rajparsaniya.function.functional.exception.IIntToLongFunction;
import io.github.rajparsaniya.function.functional.exception.IIntUnaryOperator;
import io.github.rajparsaniya.function.functional.exception.ILongBinaryOperator;
import io.github.rajparsaniya.function.functional.exception.ILongConsumer;
import io.github.rajparsaniya.function.functional.exception.ILongFunction;
import io.github.rajparsaniya.function.functional.exception.ILongPredicate;
import io.github.rajparsaniya.function.functional.exception.ILongSupplier;
import io.github.rajparsaniya.function.functional.exception.ILongToDoubleFunction;
import io.github.rajparsaniya.function.functional.exception.ILongToIntFunction;
import io.github.rajparsaniya.function.functional.exception.ILongUnaryOperator;
import io.github.rajparsaniya.function.functional.exception.IObjDoubleConsumer;
import io.github.rajparsaniya.function.functional.exception.IObjIntConsumer;
import io.github.rajparsaniya.function.functional.exception.IObjLongConsumer;
import io.github.rajparsaniya.function.functional.exception.IPredicate;
import io.github.rajparsaniya.function.functional.exception.ISupplier;
import io.github.rajparsaniya.function.functional.exception.IToDoubleBiFunction;
import io.github.rajparsaniya.function.functional.exception.IToDoubleFunction;
import io.github.rajparsaniya.function.functional.exception.IToIntBiFunction;
import io.github.rajparsaniya.function.functional.exception.IToIntFunction;
import io.github.rajparsaniya.function.functional.exception.IToLongBiFunction;
import io.github.rajparsaniya.function.functional.exception.IToLongFunction;
import io.github.rajparsaniya.function.functional.exception.IUnaryOperator;
import io.github.rajparsaniya.handler.functional.exception.IFunctionalExceptionHandler;

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
 * The {@code FunctionalExceptionHandler} class provides an implementation of the
 * {@link IFunctionalExceptionHandler} interface.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class FunctionalExceptionHandler extends BaseExceptionHandler implements IFunctionalExceptionHandler {

    /**
     * Constructs a {@code FunctionalExceptionHandler} with a default behaviour.
     *
     * @since 1.0.0
     */
    public FunctionalExceptionHandler() {
        super.setThrowable(e -> new FunctionalHandlerException(e));
    }

    /**
     * Constructs a {@code FunctionalExceptionHandler} with a specified exception supplier.
     *
     * @param exception a {@link Supplier} providing a {@link RuntimeException} instance
     *                  when needed.
     * @since 1.0.0
     */
    public FunctionalExceptionHandler(final Supplier<? extends RuntimeException> exception) {
        super(exception);
    }

    /**
     * Constructs a {@code FunctionalExceptionHandler} with a specified exception function.
     *
     * @param exception a {@link Function} that takes an {@link Exception} and returns a
     *                  {@link RuntimeException} instance when needed.
     * @since 1.0.0
     */
    public FunctionalExceptionHandler(final Function<Exception, ? extends RuntimeException> exception) {
        super(exception);
    }

    @Override
    public BooleanSupplier booleanSupplier(final IBooleanSupplier booleanSupplier) {
        return () -> {
            try {
                return booleanSupplier.getAsBoolean();
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntSupplier intSupplier(final IIntSupplier intSupplier) {
        return () -> {
            try {
                return intSupplier.getAsInt();
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntConsumer intConsumer(final IIntConsumer intConsumer) {
        return value -> {
            try {
                intConsumer.accept(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntPredicate intPredicate(final IIntPredicate intPredicate) {
        return value -> {
            try {
                return intPredicate.test(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntToLongFunction intToLongFunction(final IIntToLongFunction intToLongFunction) {
        return value -> {
            try {
                return intToLongFunction.applyAsLong(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntToDoubleFunction intToDoubleFunction(final IIntToDoubleFunction intToDoubleFunction) {
        return value -> {
            try {
                return intToDoubleFunction.applyAsDouble(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntBinaryOperator intBinaryOperator(final IIntBinaryOperator intBinaryOperator) {
        return (left, right) -> {
            try {
                return intBinaryOperator.applyAsInt(left, right);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public IntUnaryOperator intUnaryOperator(final IIntUnaryOperator intUnaryOperator) {
        return operand -> {
            try {
                return intUnaryOperator.applyAsInt(operand);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongSupplier longSupplier(final ILongSupplier longSupplier) {
        return () -> {
            try {
                return longSupplier.getAsLong();
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongConsumer longConsumer(final ILongConsumer longConsumer) {
        return value -> {
            try {
                longConsumer.accept(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongPredicate longPredicate(final ILongPredicate longPredicate) {
        return value -> {
            try {
                return longPredicate.test(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongToIntFunction longToIntFunction(final ILongToIntFunction longToIntFunction) {
        return value -> {
            try {
                return longToIntFunction.applyAsInt(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongToDoubleFunction longToDoubleFunction(final ILongToDoubleFunction longToDoubleFunction) {
        return value -> {
            try {
                return longToDoubleFunction.applyAsDouble(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongBinaryOperator longBinaryOperator(final ILongBinaryOperator longBinaryOperator) {
        return (left, right) -> {
            try {
                return longBinaryOperator.applyAsLong(left, right);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public LongUnaryOperator longUnaryOperator(final ILongUnaryOperator longUnaryOperator) {
        return operand -> {
            try {
                return longUnaryOperator.applyAsLong(operand);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleSupplier doubleSupplier(final IDoubleSupplier doubleSupplier) {
        return () -> {
            try {
                return doubleSupplier.getAsDouble();
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleConsumer doubleConsumer(final IDoubleConsumer doubleConsumer) {
        return value -> {
            try {
                doubleConsumer.accept(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoublePredicate doublePredicate(final IDoublePredicate doublePredicate) {
        return value -> {
            try {
                return doublePredicate.test(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleToIntFunction doubleToIntFunction(final IDoubleToIntFunction doubleToIntFunction) {
        return value -> {
            try {
                return doubleToIntFunction.applyAsInt(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleToLongFunction doubleToLongFunction(final IDoubleToLongFunction doubleToLongFunction) {
        return value -> {
            try {
                return doubleToLongFunction.applyAsLong(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleBinaryOperator doubleBinaryOperator(final IDoubleBinaryOperator doubleBinaryOperator) {
        return (left, right) -> {
            try {
                return doubleBinaryOperator.applyAsDouble(left, right);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public DoubleUnaryOperator doubleUnaryOperator(final IDoubleUnaryOperator doubleUnaryOperator) {
        return operand -> {
            try {
                return doubleUnaryOperator.applyAsDouble(operand);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Supplier<T> supplier(final ISupplier<T> supplier) {
        return () -> {
            try {
                return supplier.get();
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Consumer<T> consumer(final IConsumer<T> consumer) {
        return t -> {
            try {
                consumer.accept(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Predicate<T> predicate(final IPredicate<T> predicate) {
        return t -> {
            try {
                return predicate.test(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, R> Function<T, R> function(final IFunction<T, R> function) {
        return t -> {
            try {
                return function.apply(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> BiConsumer<T, U> biConsumer(final IBiConsumer<T, U> biConsumer) {
        return (t, u) -> {
            try {
                biConsumer.accept(t, u);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> BiPredicate<T, U> biPredicate(final IBiPredicate<T, U> biPredicate) {
        return (t, u) -> {
            try {
                return biPredicate.test(t, u);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U, R> BiFunction<T, U, R> biFunction(final IBiFunction<T, U, R> biFunction) {
        return (t, u) -> {
            try {
                return biFunction.apply(t, u);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> BinaryOperator<T> binaryOperator(final IBinaryOperator<T> binaryOperator) {
        return (t, u) -> {
            try {
                return binaryOperator.apply(t, u);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToIntFunction<T> toIntFunction(final IToIntFunction<T> toIntFunction) {
        return value -> {
            try {
                return toIntFunction.applyAsInt(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToLongFunction<T> toLongFunction(final IToLongFunction<T> toLongFunction) {
        return value -> {
            try {
                return toLongFunction.applyAsLong(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToDoubleFunction<T> toDoubleFunction(final IToDoubleFunction<T> toDoubleFunction) {
        return value -> {
            try {
                return toDoubleFunction.applyAsDouble(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> ToIntBiFunction<T, U> toIntBiFunction(final IToIntBiFunction<T, U> toIntBiFunction) {
        return (t, u) -> {
            try {
                return toIntBiFunction.applyAsInt(t, u);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> ToLongBiFunction<T, U> toLongBiFunction(final IToLongBiFunction<T, U> toLongBiFunction) {
        return (t, u) -> {
            try {
                return toLongBiFunction.applyAsLong(t, u);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, U> ToDoubleBiFunction<T, U> toDoubleBiFunction(final IToDoubleBiFunction<T, U> toDoubleBiFunction) {
        return (t, u) -> {
            try {
                return toDoubleBiFunction.applyAsDouble(t, u);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <R> IntFunction<R> intFunction(final IIntFunction<R> intFunction) {
        return value -> {
            try {
                return intFunction.apply(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <R> LongFunction<R> longFunction(final ILongFunction<R> longFunction) {
        return value -> {
            try {
                return longFunction.apply(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <R> DoubleFunction<R> doubleFunction(final IDoubleFunction<R> doubleFunction) {
        return value -> {
            try {
                return doubleFunction.apply(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ObjIntConsumer<T> objIntConsumer(final IObjIntConsumer<T> objIntConsumer) {
        return (t, value) -> {
            try {
                objIntConsumer.accept(t, value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ObjLongConsumer<T> objLongConsumer(final IObjLongConsumer<T> objLongConsumer) {
        return (t, value) -> {
            try {
                objLongConsumer.accept(t, value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ObjDoubleConsumer<T> objDoubleConsumer(final IObjDoubleConsumer<T> objDoubleConsumer) {
        return (t, value) -> {
            try {
                objDoubleConsumer.accept(t, value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> UnaryOperator<T> unaryOperator(final IUnaryOperator<T> unaryOperator) {
        return t -> {
            try {
                return unaryOperator.apply(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Comparator<T> comparator(final IComparator<T> comparator) {
        return (o1, o2) -> {
            try {
                return comparator.compare(o1, o2);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }
}
