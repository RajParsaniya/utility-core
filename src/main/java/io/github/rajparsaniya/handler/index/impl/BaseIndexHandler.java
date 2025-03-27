package io.github.rajparsaniya.handler.index.impl;

import io.github.rajparsaniya.handler.index.IBaseIndexHandler;

public class BaseIndexHandler implements IBaseIndexHandler {
    private int initialIndex = 0;

    protected BaseIndexHandler() {
    }

    protected BaseIndexHandler(final int initialIndex) {
        this.initialIndex = initialIndex;
    }

    @Override
    public void setInitialIndex(int initialIndex) {
        this.initialIndex = initialIndex;
    }

    protected int initialIndex() {
        return initialIndex;
    }
}
