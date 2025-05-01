package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.utility.FunctionalUtilityException;
import io.github.rajparsaniya.handler.functional.core.IFunctionalHandler;
import io.github.rajparsaniya.handler.functional.core.impl.FunctionalHandler;
import io.github.rajparsaniya.handler.functional.exception.IFunctionalExceptionHandler;
import io.github.rajparsaniya.handler.functional.exception.impl.FunctionalExceptionHandler;
import io.github.rajparsaniya.handler.functional.index.IFunctionalIndexHandler;
import io.github.rajparsaniya.handler.functional.index.impl.FunctionalIndexHandler;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * A utility class providing static factory methods to create instances of functional handlers.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class FunctionalUtils {

    /**
     * Constructs a {@code FunctionalUtils} instance with restricted access.
     *
     * @since 1.0.0
     */
    private FunctionalUtils() {
    }

    /**
     * Returns a default instance of {@link IFunctionalHandler} for functional core operations.
     *
     * @return a default instance of {@link FunctionalHandler}.
     * @since 1.0.0
     */
    public static IFunctionalHandler handler() {
        return new FunctionalHandler();
    }

    /**
     * Returns a default {@link IFunctionalExceptionHandler} with a wrapper that converts any
     * {@link Exception} into a {@link FunctionalUtilityException}.
     *
     * @return a configured instance of {@link FunctionalExceptionHandler}.
     * @since 1.0.0
     */
    public static IFunctionalExceptionHandler exceptionHandler() {
        return new FunctionalExceptionHandler((e) -> new FunctionalUtilityException(e));
    }

    /**
     * Returns an {@link IFunctionalExceptionHandler} using the provided {@link Supplier}
     * to create custom runtime exceptions.
     *
     * @param exception a supplier of runtime exceptions.
     * @return a configured instance of {@link FunctionalExceptionHandler}.
     * @since 1.0.0
     */
    public static IFunctionalExceptionHandler exceptionHandler(final Supplier<? extends RuntimeException> exception) {
        return new FunctionalExceptionHandler(exception);
    }

    /**
     * Returns an {@link IFunctionalExceptionHandler} using the provided {@link Function}
     * that maps exceptions to custom runtime exceptions.
     *
     * @param exception a function to transform checked exceptions into runtime exceptions.
     * @return a configured instance of {@link FunctionalExceptionHandler}.
     * @since 1.0.0
     */
    public static IFunctionalExceptionHandler exceptionHandler(final Function<Exception, ? extends RuntimeException> exception) {
        return new FunctionalExceptionHandler(exception);
    }

    /**
     * Returns a default {@link IFunctionalIndexHandler} starting from index 0.
     *
     * @return a default instance of {@link FunctionalIndexHandler}.
     * @since 1.0.0
     */
    public static IFunctionalIndexHandler indexHandler() {
        return new FunctionalIndexHandler();
    }

    /**
     * Returns an {@link IFunctionalIndexHandler} initialized with the given index.
     *
     * @param initialIndex the starting index for the handler.
     * @return a configured instance of {@link FunctionalIndexHandler}.
     * @since 1.0.0
     */
    public static IFunctionalIndexHandler indexHandler(final int initialIndex) {
        return new FunctionalIndexHandler(initialIndex);
    }
}
