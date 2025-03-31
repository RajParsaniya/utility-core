package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.utility.FunctionalUtilityException;
import io.github.rajparsaniya.handler.core.IFunctionalHandler;
import io.github.rajparsaniya.handler.core.impl.FunctionalHandler;
import io.github.rajparsaniya.handler.exception.IFunctionalExceptionHandler;
import io.github.rajparsaniya.handler.exception.impl.FunctionalExceptionHandler;
import io.github.rajparsaniya.handler.index.IFunctionalIndexHandler;
import io.github.rajparsaniya.handler.index.impl.FunctionalIndexHandler;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalUtils {
    private FunctionalUtils() {
    }

    public static IFunctionalHandler handler() {
        return new FunctionalHandler();
    }

    public static IFunctionalExceptionHandler exceptionHandler() {
        return new FunctionalExceptionHandler((e) -> new FunctionalUtilityException(e));
    }

    public static IFunctionalExceptionHandler exceptionHandler(final Supplier<? extends RuntimeException> exception) {
        return new FunctionalExceptionHandler(exception);
    }

    public static IFunctionalExceptionHandler exceptionHandler(final Function<Exception, ? extends RuntimeException> exception) {
        return new FunctionalExceptionHandler(exception);
    }

    public static IFunctionalIndexHandler indexHandler() {
        return new FunctionalIndexHandler();
    }

    public static IFunctionalIndexHandler indexHandler(final int initialIndex) {
        return new FunctionalIndexHandler(initialIndex);
    }
}
