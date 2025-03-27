package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IIntToLongFunction {
    long applyAsLong(final int value, final int index);
}
