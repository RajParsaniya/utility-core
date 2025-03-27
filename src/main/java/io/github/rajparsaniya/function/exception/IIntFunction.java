package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IIntFunction<R> {
    R apply(final int value) throws Exception;
}
