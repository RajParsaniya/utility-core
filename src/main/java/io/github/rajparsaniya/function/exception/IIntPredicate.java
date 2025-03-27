package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IIntPredicate {
    boolean test(final int value) throws Exception;
}
