package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IDoublePredicate {
    boolean test(final double value) throws Exception;
}
