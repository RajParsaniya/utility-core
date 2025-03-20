package io.github.rajparsaniya.function;

@FunctionalInterface
public interface ILongFunction<R> {
    R apply(final long value) throws Exception;
}
