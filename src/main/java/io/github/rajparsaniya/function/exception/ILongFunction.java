package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface ILongFunction<R> {
    R apply(final long value) throws Exception;
}
