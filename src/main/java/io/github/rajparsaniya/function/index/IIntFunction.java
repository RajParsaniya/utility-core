package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IIntFunction<R> {
    R apply(final int value, final int index);
}
