package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IDoubleFunction<R> {
    R apply(final double value, final int index);
}
