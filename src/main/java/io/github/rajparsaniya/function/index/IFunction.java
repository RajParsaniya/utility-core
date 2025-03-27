package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IFunction<T, R> {
    R apply(final T t, final int index);
}
