package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IPredicate<T> {
    boolean test(final T t) throws Exception;
}
