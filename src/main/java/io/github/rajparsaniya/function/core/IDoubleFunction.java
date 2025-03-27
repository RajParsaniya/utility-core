package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IDoubleFunction<R> {
    R apply(final double value, final int index) throws Exception;
}
