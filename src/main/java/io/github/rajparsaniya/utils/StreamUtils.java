package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.utility.StreamUtilityException;
import io.github.rajparsaniya.handler.IStreamHandler;
import io.github.rajparsaniya.handler.impl.StreamHandler;

import java.util.function.Function;
import java.util.function.Supplier;

public class StreamUtils {
    private StreamUtils() {
    }

    public static IStreamHandler handler() {
        return new StreamHandler((e) -> new StreamUtilityException((e)));
    }

    public static IStreamHandler handler(final Supplier<? extends RuntimeException> exception) {
        return new StreamHandler(exception);
    }

    public static IStreamHandler handler(final Function<Exception, ? extends RuntimeException> exception) {
        return new StreamHandler(exception);
    }
}
