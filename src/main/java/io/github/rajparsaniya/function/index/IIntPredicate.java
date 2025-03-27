package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IIntPredicate {
    boolean test(final int value, final int index);
}
