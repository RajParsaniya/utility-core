package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IDoubleFunction<R> {
    R apply(final double value) throws Exception;
}
