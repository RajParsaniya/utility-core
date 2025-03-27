package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface ILongToDoubleFunction {
    double applyAsDouble(final long value, final int index);
}
