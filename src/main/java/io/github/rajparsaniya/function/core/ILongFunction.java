package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface ILongFunction<R> {
    R apply(final long value, final int index) throws Exception;
}
