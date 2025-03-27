package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IPredicate<T> {
    boolean test(final T t, final int index);
}
