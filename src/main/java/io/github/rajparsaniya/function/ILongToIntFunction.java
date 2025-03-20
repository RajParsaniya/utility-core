package io.github.rajparsaniya.function;

@FunctionalInterface
public interface ILongToIntFunction {
    int applyAsInt(long value) throws Exception;
}
