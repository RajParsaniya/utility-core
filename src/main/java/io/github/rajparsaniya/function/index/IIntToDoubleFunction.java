package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IIntToDoubleFunction {
    double applyAsDouble(final int value, final int index);
}
