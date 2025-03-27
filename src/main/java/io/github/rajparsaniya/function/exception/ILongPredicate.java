package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface ILongPredicate {
    boolean test(final long value) throws Exception;
}
