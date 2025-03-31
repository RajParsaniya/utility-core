package io.github.rajparsaniya.handler.index.impl;

import io.github.rajparsaniya.handler.index.IBaseIndexHandler;

public class BaseIndexHandler implements IBaseIndexHandler {
    private int initialIndex;

    protected BaseIndexHandler() {
    }

    protected BaseIndexHandler(final Integer initialIndex) {
        this.initialIndex = initialIndex;
    }

    @Override
    public void setInitialIndex(final int initialIndex) {
        this.initialIndex = initialIndex;
    }

    protected int initialIndex() {
        return this.initialIndex;
    }
}
