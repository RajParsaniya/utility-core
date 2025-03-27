package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IDoublePredicate {
    boolean test(final double value, final int index) throws Exception;
}
