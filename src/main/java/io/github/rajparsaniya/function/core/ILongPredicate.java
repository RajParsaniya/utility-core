package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface ILongPredicate {
    boolean test(final long value, final int index) throws Exception;
}
