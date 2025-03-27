package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IIntPredicate {
    boolean test(final int value, final int index) throws Exception;
}
