package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IBiConsumer<T, U> {
    void accept(final T t, final U u) throws Exception;
}
