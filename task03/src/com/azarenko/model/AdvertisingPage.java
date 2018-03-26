package com.azarenko.model;

public class AdvertisingPage extends Page {
    private boolean authorize;
    private String type;

    public boolean isAuthorize() {
        return authorize;
    }

    public void setAuthorize(boolean authorize) {
        this.authorize = authorize;
    }

    public AdvertisingPage(String title) {
        super(title);
    }

    public AdvertisingPage() {
    }
}
