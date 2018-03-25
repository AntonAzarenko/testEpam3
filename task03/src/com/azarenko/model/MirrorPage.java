package com.azarenko.model;

import java.util.List;

public class MirrorPage extends Page {
    private String email;
    private List<String> arcives;

    public MirrorPage(String title) {
        super(title);
    }
}
