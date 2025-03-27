package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface IDoubleConsumer {
    void accept(final double value, final int index);
}
