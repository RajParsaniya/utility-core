package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IDoublePredicate {
    boolean test(final double value) throws Exception;
}
