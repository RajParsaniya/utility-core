package io.github.rajparsaniya.function.core;

@FunctionalInterface
public interface IDoubleConsumer {
    void accept(final double value, final int index) throws Exception;
}
