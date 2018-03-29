package com.azarenko.util;

public enum PageEnum {
    SITE("site"),
    PAGE("page"),
    SECRETBALLOT("secretballot"),
    LOGIN("login"),
    PASSWORD("password"),
    TITLE("tytle"),
    AUTORIZE("authorize"),
    TYPE("type"),
    NEWS("news"),
    EMAIL("email"),
    VOTE("vote"),
    VOTEAUTORIZE("voteautorize"),
    PAID("paid"),
    ARCHIVES("archives");

    private String value;


    public String getValue() {
        return value;
    }

    PageEnum(String value) {
        this.value = value;
    }
}
