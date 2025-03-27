package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IPredicate<T> {
    boolean test(final T t, final int index) throws Exception;
}
