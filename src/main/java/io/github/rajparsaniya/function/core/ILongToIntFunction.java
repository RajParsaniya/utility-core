package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface ILongToIntFunction {
    int applyAsInt(long value, final int index) throws Exception;
}
