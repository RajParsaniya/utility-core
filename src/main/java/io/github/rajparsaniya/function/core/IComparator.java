package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IComparator<T> {
    int compare(final T o1, final T o2, final int index) throws Exception;
}
