package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IIntConsumer {
    void accept(final int value, final int index) throws Exception;
}
