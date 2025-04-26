package io.github.rajparsaniya.handler.functional.index.impl;

import io.github.rajparsaniya.handler.functional.index.IBaseIndexHandler;

/**
 * The {@code BaseIndexHandler} class provides an implementation of the
 * {@link IBaseIndexHandler} interface.
 *
 * @author Raj Parsaniya
 * @since 1.0.0
 */
public class BaseIndexHandler implements IBaseIndexHandler {
    private int initialIndex;

    /**
     * Constructs a {@code BaseIndexHandler} with a default behaviour.
     *
     * @since 1.0.0
     */
    protected BaseIndexHandler() {
    }

    /**
     * Constructs a {@code BaseIndexHandler} with a specified initial index.
     *
     * @param initialIndex the initial index value to be set.
     * @since 1.0.0
     */
    protected BaseIndexHandler(final Integer initialIndex) {
        this.initialIndex = initialIndex;
    }

    @Override
    public void setInitialIndex(final int initialIndex) {
        this.initialIndex = initialIndex;
    }

    /**
     * Returns the initial index value.
     *
     * @return the initial index value.
     * @since 1.0.0
     */
    protected int initialIndex() {
        return this.initialIndex;
    }
}
