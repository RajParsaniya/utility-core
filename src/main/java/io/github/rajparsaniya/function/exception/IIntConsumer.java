package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IIntConsumer {
    void accept(final int value) throws Exception;
}
