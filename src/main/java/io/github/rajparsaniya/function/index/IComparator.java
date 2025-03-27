package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IComparator<T> {
    int compare(final T o1, final T o2, final int index);
}
