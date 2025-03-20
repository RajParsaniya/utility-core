package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.utility.OptionalUtilityException;
import io.github.rajparsaniya.handler.IOptionalHandler;
import io.github.rajparsaniya.handler.impl.OptionalHandler;

import java.util.function.Function;
import java.util.function.Supplier;

public class OptionalUtils {
    private OptionalUtils() {
    }

    public static IOptionalHandler handler() {
        return new OptionalHandler((e) -> new OptionalUtilityException(e));
    }

    public static IOptionalHandler handler(final Supplier<? extends RuntimeException> exception) {
        return new OptionalHandler(exception);
    }

    public static IOptionalHandler handler(final Function<Exception, ? extends RuntimeException> exception) {
        return new OptionalHandler(exception);
    }
}
