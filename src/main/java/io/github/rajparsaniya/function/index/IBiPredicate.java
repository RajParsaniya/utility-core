package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IBiPredicate<T, U> {
    boolean test(final T t, final U u, final int index);
}
