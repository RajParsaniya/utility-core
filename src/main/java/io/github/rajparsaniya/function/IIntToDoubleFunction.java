package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IIntToDoubleFunction {
    double applyAsDouble(final int value) throws Exception;
}
