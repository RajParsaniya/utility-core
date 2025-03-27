package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IIntFunction<R> {
    R apply(final int value, final int index) throws Exception;
}
