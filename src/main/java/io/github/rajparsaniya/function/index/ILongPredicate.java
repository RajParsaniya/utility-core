package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface ILongPredicate {
    boolean test(final long value, final int index);
}
