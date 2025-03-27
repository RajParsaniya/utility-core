package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IIntToDoubleFunction {
    double applyAsDouble(final int value, final int index) throws Exception;
}
