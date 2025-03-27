package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface ILongConsumer {
    void accept(final long value) throws Exception;
}
