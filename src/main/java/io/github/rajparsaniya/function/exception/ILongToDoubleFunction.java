package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface ILongToDoubleFunction {
    double applyAsDouble(final long value) throws Exception;
}
