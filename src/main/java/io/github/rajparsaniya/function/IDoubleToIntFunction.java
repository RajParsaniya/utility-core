package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IDoubleToIntFunction {
    int applyAsInt(final double value) throws Exception;
}
