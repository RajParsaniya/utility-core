package io.github.rajparsaniya.function.exception;

@FunctionalInterface
public interface IDoubleConsumer {
    void accept(final double value) throws Exception;
}
