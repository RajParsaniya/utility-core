package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface ILongToIntFunction {
    int applyAsInt(long value, final int index);
}
