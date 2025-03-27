package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface ILongConsumer {
    void accept(final long value, final int index) throws Exception;
}
