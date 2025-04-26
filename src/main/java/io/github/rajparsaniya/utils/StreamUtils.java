package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.utility.StreamUtilityException;
import io.github.rajparsaniya.handler.stream.core.IStreamHandler;
import io.github.rajparsaniya.handler.stream.core.impl.StreamHandler;
import io.github.rajparsaniya.handler.stream.exception.IStreamExceptionHandler;
import io.github.rajparsaniya.handler.stream.exception.impl.StreamExceptionHandler;
import io.github.rajparsaniya.handler.stream.index.IStreamIndexHandler;
import io.github.rajparsaniya.handler.stream.index.impl.StreamIndexHandler;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * A utility class that provides factory methods to create instances of stream-based functional handlers.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class StreamUtils {

    /**
     * Constructs a {@code StreamUtils} instance with restricted access.
     *
     * @since 1.0.0
     */
    private StreamUtils() {
    }

    /**
     * Returns a default instance of {@link IStreamHandler} for stream-based functional operations.
     *
     * @return a default instance of {@link StreamHandler}.
     * @since 1.0.0
     */
    public static IStreamHandler handler() {
        return new StreamHandler();
    }

    /**
     * Returns a default {@link IStreamExceptionHandler} that wraps any {@link Exception}
     * into a {@link StreamUtilityException}.
     *
     * @return a configured instance of {@link StreamExceptionHandler}.
     * @since 1.0.0
     */
    public static IStreamExceptionHandler exceptionHandler() {
        return new StreamExceptionHandler((e) -> new StreamUtilityException((e)));
    }

    /**
     * Returns an {@link IStreamExceptionHandler} using the provided {@link Supplier}
     * to create custom runtime exceptions.
     *
     * @param exception a supplier of runtime exceptions.
     * @return a configured instance of {@link StreamExceptionHandler}.
     * @since 1.0.0
     */
    public static IStreamExceptionHandler exceptionHandler(final Supplier<? extends RuntimeException> exception) {
        return new StreamExceptionHandler(exception);
    }

    /**
     * Returns an {@link IStreamExceptionHandler} using the provided {@link Function}
     * to transform exceptions into custom runtime exceptions.
     *
     * @param exception a function to convert checked exceptions into runtime exceptions
     * @return a configured instance of {@link StreamExceptionHandler}.
     * @since 1.0.0
     */
    public static IStreamExceptionHandler exceptionHandler(final Function<Exception, ? extends RuntimeException> exception) {
        return new StreamExceptionHandler(exception);
    }

    /**
     * Returns a default {@link IStreamIndexHandler} initialized with index 0.
     *
     * @return a default instance of {@link StreamIndexHandler}.
     * @since 1.0.0
     */
    public static IStreamIndexHandler indexHandler() {
        return new StreamIndexHandler();
    }

    /**
     * Returns an {@link IStreamIndexHandler} initialized with the given starting index.
     *
     * @param initialIndex the index to initialize the handler with.
     * @return a configured instance of {@link StreamIndexHandler}.
     * @since 1.0.0
     */
    public static IStreamIndexHandler indexHandler(final int initialIndex) {
        return new StreamIndexHandler(initialIndex);
    }
}
