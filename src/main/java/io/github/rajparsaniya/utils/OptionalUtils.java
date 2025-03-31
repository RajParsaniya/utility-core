package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.utility.OptionalUtilityException;
import io.github.rajparsaniya.handler.core.IOptionalHandler;
import io.github.rajparsaniya.handler.core.impl.OptionalHandler;
import io.github.rajparsaniya.handler.exception.IOptionalExceptionHandler;
import io.github.rajparsaniya.handler.exception.impl.OptionalExceptionHandler;
import io.github.rajparsaniya.handler.index.IOptionalIndexHandler;
import io.github.rajparsaniya.handler.index.impl.OptionalIndexHandler;

import java.util.function.Function;
import java.util.function.Supplier;

public class OptionalUtils {
    private OptionalUtils() {
    }

    public static IOptionalHandler handler() {
        return new OptionalHandler();
    }

    public static IOptionalExceptionHandler exceptionHandler() {
        return new OptionalExceptionHandler((e) -> new OptionalUtilityException(e));
    }

    public static IOptionalExceptionHandler exceptionHandler(final Supplier<? extends RuntimeException> exception) {
        return new OptionalExceptionHandler(exception);
    }

    public static IOptionalExceptionHandler exceptionHandler(final Function<Exception, ? extends RuntimeException> exception) {
        return new OptionalExceptionHandler(exception);
    }

    public static IOptionalIndexHandler indexHandler() {
        return new OptionalIndexHandler();
    }

    public static IOptionalIndexHandler indexHandler(final int initialIndex) {
        return new OptionalIndexHandler(initialIndex);
    }
}
