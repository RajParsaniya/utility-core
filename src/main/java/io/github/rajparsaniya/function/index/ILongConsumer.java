package io.github.rajparsaniya.function.index;

@FunctionalInterface
public interface ILongConsumer {
    void accept(final long value, final int index);
}
