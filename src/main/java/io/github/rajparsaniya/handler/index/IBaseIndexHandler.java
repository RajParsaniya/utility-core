package io.github.rajparsaniya.handler.index;

import io.github.rajparsaniya.handler.core.IBaseHandler;

/**
 * The {@code IBaseIndexHandler} interface provides functionality for managing indexed processing
 * within a handler. It allows setting an initial index value that can be used for tracking
 * or controlling sequential operations.
 *
 * <p>This interface is designed to work alongside {@link IBaseHandler} for structured
 * index-based processing.
 *
 * @author Raj Parsaniya
 * @see IBaseHandler
 * @since 1.0.0
 */
public interface IBaseIndexHandler {

    /**
     * Sets the initial index value, which may be used for indexed processing within the handler.
     *
     * @param initialIndex the starting index value.
     * @since 1.0.0
     */
    void setInitialIndex(final int initialIndex);
}
