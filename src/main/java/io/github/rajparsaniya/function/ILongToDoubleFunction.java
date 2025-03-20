package io.github.rajparsaniya.function;

@FunctionalInterface
public interface ILongToDoubleFunction {
    double applyAsDouble(final long value) throws Exception;
}
