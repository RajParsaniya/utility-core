package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IDoubleToIntFunction {
    int applyAsInt(final double value) throws Exception;
}
