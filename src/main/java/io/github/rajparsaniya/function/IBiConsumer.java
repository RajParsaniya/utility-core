package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IBiConsumer<T, U> {
    void accept(final T t, final U u) throws Exception;
}
