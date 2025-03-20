package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.utility.FunctionalUtilityException;
import io.github.rajparsaniya.handler.IFunctionalHandler;
import io.github.rajparsaniya.handler.impl.FunctionalHandler;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalUtils {
    private FunctionalUtils() {
    }

    public static IFunctionalHandler handler() {
        return new FunctionalHandler((e) -> new FunctionalUtilityException(e));
    }

    public static IFunctionalHandler handler(final Supplier<? extends RuntimeException> exception) {
        return new FunctionalHandler(exception);
    }

    public static IFunctionalHandler handler(final Function<Exception, ? extends RuntimeException> exception) {
        return new FunctionalHandler(exception);
    }
}
