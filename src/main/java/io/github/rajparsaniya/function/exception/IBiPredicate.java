package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IBiPredicate<T, U> {
    boolean test(final T t, final U u) throws Exception;
}
