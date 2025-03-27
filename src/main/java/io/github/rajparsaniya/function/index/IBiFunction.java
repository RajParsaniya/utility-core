package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IBiFunction<T, U, R> {
    R apply(final T t, final U u, final int index);
}
