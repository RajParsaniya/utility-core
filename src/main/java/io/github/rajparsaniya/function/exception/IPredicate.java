package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IPredicate<T> {
    boolean test(final T t) throws Exception;
}
