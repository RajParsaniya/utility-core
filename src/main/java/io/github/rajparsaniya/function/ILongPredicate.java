package io.github.rajparsaniya.function;

@FunctionalInterface
public interface ILongPredicate {
    boolean test(final long value) throws Exception;
}
