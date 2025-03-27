package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface ILongToIntFunction {
    int applyAsInt(long value) throws Exception;
}
