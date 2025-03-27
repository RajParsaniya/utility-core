package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface ILongFunction<R> {
    R apply(final long value, final int index);
}
