package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IBiFunction<T, U, R> {
    R apply(final T t, final U u) throws Exception;
}
