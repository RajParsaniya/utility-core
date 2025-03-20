package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IBiPredicate<T, U> {
    boolean test(final T t, final U u) throws Exception;
}
