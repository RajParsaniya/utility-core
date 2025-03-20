package io.github.rajparsaniya.function;

@FunctionalInterface
public interface IIntFunction<R> {
    R apply(final int value) throws Exception;
}
