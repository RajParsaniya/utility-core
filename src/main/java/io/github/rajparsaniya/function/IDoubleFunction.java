package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IDoubleFunction<R> {
    R apply(final double value) throws Exception;
}
