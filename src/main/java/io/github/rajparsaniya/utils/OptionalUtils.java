package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.utility.OptionalUtilityException;
import io.github.rajparsaniya.handler.optional.core.IOptionalHandler;
import io.github.rajparsaniya.handler.optional.core.impl.OptionalHandler;
import io.github.rajparsaniya.handler.optional.exception.IOptionalExceptionHandler;
import io.github.rajparsaniya.handler.optional.exception.impl.OptionalExceptionHandler;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * A utility class that provides factory methods to create instances of optional-based functional handlers.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class OptionalUtils {

    /**
     * Constructs a {@code OptionalUtils} instance with restricted access.
     *
     * @since 1.0.0
     */
    private OptionalUtils() {
    }

    /**
     * Returns a default instance of {@link IOptionalHandler} for optional-based functional operations.
     *
     * @return a default instance of {@link OptionalHandler}
     * @since 1.0.0
     */
    public static IOptionalHandler handler() {
        return new OptionalHandler();
    }

    /**
     * Returns a default {@link IOptionalExceptionHandler} that wraps any {@link Exception}
     * into an {@link OptionalUtilityException}.
     *
     * @return a configured instance of {@link OptionalExceptionHandler}.
     * @since 1.0.0
     */
    public static IOptionalExceptionHandler exceptionHandler() {
        return new OptionalExceptionHandler((e) -> new OptionalUtilityException(e));
    }

    /**
     * Returns an {@link IOptionalExceptionHandler} using the provided {@link Supplier}
     * to create custom runtime exceptions.
     *
     * @param exception a supplier of runtime exceptions.
     * @return a configured instance of {@link OptionalExceptionHandler}.
     * @since 1.0.0
     */
    public static IOptionalExceptionHandler exceptionHandler(final Supplier<? extends RuntimeException> exception) {
        return new OptionalExceptionHandler(exception);
    }

    /**
     * Returns an {@link IOptionalExceptionHandler} using the provided {@link Function}
     * to transform exceptions into custom runtime exceptions.
     *
     * @param exception a function to convert checked exceptions into runtime exceptions.
     * @return a configured instance of {@link OptionalExceptionHandler}.
     * @since 1.0.0
     */
    public static IOptionalExceptionHandler exceptionHandler(final Function<Exception, ? extends RuntimeException> exception) {
        return new OptionalExceptionHandler(exception);
    }
}
