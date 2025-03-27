package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IToIntBiFunction<T, U> {
    int applyAsInt(final T t, final U u) throws Exception;
}
