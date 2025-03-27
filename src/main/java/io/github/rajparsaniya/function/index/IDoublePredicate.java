package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IDoublePredicate {
    boolean test(final double value, final int index);
}
