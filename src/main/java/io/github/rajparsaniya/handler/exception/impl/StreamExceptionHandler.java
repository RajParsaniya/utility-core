package io.github.rajparsaniya.handler.exception.impl;

import io.github.rajparsaniya.exception.handler.StreamHandlerException;
import io.github.rajparsaniya.function.exception.IBiConsumer;
import io.github.rajparsaniya.function.exception.IComparator;
import io.github.rajparsaniya.function.exception.IConsumer;
import io.github.rajparsaniya.function.exception.IFunction;
import io.github.rajparsaniya.function.exception.IPredicate;
import io.github.rajparsaniya.function.exception.IToDoubleFunction;
import io.github.rajparsaniya.function.exception.IToIntFunction;
import io.github.rajparsaniya.function.exception.IToLongFunction;
import io.github.rajparsaniya.handler.exception.IStreamExceptionHandler;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExceptionHandler extends BaseExceptionHandler implements IStreamExceptionHandler {
    public StreamExceptionHandler() {
        super.throwable((e) -> new StreamHandlerException(e));
    }

    public StreamExceptionHandler(final Supplier<? extends RuntimeException> exception) {
        super(exception);
    }

    public StreamExceptionHandler(final Function<Exception, ? extends RuntimeException> exception) {
        super(exception);
    }

    @Override
    public <T> Predicate<T> filter(final IPredicate<T> predicate) {
        return t -> {
            try {
                return predicate.test(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, R> Function<T, R> map(final IFunction<T, R> mapper) {
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToIntFunction<T> mapToInt(final IToIntFunction<T> mapper) {
        return value -> {
            try {
                return mapper.applyAsInt(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToLongFunction<T> mapToLong(final IToLongFunction<T> mapper) {
        return value -> {
            try {
                return mapper.applyAsLong(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> ToDoubleFunction<T> mapToDouble(final IToDoubleFunction<T> mapper) {
        return value -> {
            try {
                return mapper.applyAsDouble(value);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, R> Function<T, Stream<R>> flatMap(final IFunction<T, Stream<R>> mapper) {
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Function<T, IntStream> flatMapToInt(final IFunction<T, IntStream> mapper) {
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Function<T, LongStream> flatMapToLong(final IFunction<T, LongStream> mapper) {
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Function<T, DoubleStream> flatMapToDouble(final IFunction<T, DoubleStream> mapper) {
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T, R> BiConsumer<T, Consumer<R>> mapMulti(final IBiConsumer<T, Consumer<R>> mapper) {
        return (t, consumer) -> {
            try {
                mapper.accept(t, consumer);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> BiConsumer<T, IntConsumer> mapMultiToInt(final IBiConsumer<T, IntConsumer> mapper) {
        return (t, intConsumer) -> {
            try {
                mapper.accept(t, intConsumer);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> BiConsumer<T, LongConsumer> mapMultiToLong(final IBiConsumer<T, LongConsumer> mapper) {
        return (t, longConsumer) -> {
            try {
                mapper.accept(t, longConsumer);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> BiConsumer<T, DoubleConsumer> mapMultiToDouble(final IBiConsumer<T, DoubleConsumer> mapper) {
        return (t, doubleConsumer) -> {
            try {
                mapper.accept(t, doubleConsumer);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Comparator<T> sorted(final IComparator<T> comparator) {
        return (o1, o2) -> {
            try {
                return comparator.compare(o1, o2);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Consumer<T> peek(final IConsumer<T> action) {
        return t -> {
            try {
                action.accept(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Predicate<T> takeWhile(final IPredicate<T> predicate) {
        return t -> {
            try {
                return predicate.test(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Predicate<T> dropWhile(final IPredicate<T> predicate) {
        return t -> {
            try {
                return predicate.test(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Consumer<T> forEach(final IConsumer<T> action) {
        return t -> {
            try {
                action.accept(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Consumer<T> forEachOrdered(final IConsumer<T> action) {
        return t -> {
            try {
                action.accept(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Predicate<T> anyMatch(final IPredicate<T> predicate) {
        return t -> {
            try {
                return predicate.test(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Predicate<T> allMatch(final IPredicate<T> predicate) {
        return t -> {
            try {
                return predicate.test(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }

    @Override
    public <T> Predicate<T> noneMatch(final IPredicate<T> predicate) {
        return t -> {
            try {
                return predicate.test(t);
            } catch (Exception e) {
                throw super.exception(e).get();
            }
        };
    }
}
