package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IComparator<T> {
    int compare(final T o1, final T o2) throws Exception;
}
