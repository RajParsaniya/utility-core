package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IIntToDoubleFunction {
    double applyAsDouble(final int value) throws Exception;
}
