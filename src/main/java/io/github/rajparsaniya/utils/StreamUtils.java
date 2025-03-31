package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.utility.StreamUtilityException;
import io.github.rajparsaniya.handler.core.IStreamHandler;
import io.github.rajparsaniya.handler.core.impl.StreamHandler;
import io.github.rajparsaniya.handler.exception.IStreamExceptionHandler;
import io.github.rajparsaniya.handler.exception.impl.StreamExceptionHandler;
import io.github.rajparsaniya.handler.index.IStreamIndexHandler;
import io.github.rajparsaniya.handler.index.impl.StreamIndexHandler;

import java.util.function.Function;
import java.util.function.Supplier;

public class StreamUtils {
    private StreamUtils() {
    }

    public static IStreamHandler handler() {
        return new StreamHandler();
    }

    public static IStreamExceptionHandler exceptionHandler() {
        return new StreamExceptionHandler((e) -> new StreamUtilityException((e)));
    }

    public static IStreamExceptionHandler exceptionHandler(final Supplier<? extends RuntimeException> exception) {
        return new StreamExceptionHandler(exception);
    }

    public static IStreamExceptionHandler exceptionHandler(final Function<Exception, ? extends RuntimeException> exception) {
        return new StreamExceptionHandler(exception);
    }

    public static IStreamIndexHandler indexHandler() {
        return new StreamIndexHandler();
    }

    public static IStreamIndexHandler indexHandler(final int initialIndex) {
        return new StreamIndexHandler(initialIndex);
    }
}
