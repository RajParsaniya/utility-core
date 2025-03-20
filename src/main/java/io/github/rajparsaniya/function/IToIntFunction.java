package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IToIntFunction<T> {
    int applyAsInt(final T value) throws Exception;
}
