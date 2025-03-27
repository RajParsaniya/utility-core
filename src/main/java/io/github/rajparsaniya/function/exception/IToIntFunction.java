package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IToIntFunction<T> {
    int applyAsInt(final T value) throws Exception;
}
