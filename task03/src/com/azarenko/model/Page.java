package com.azarenko.model;

public abstract class Page extends Site {
    private String title;

    public Page(String title) {
        this.title = title;
    }
}
