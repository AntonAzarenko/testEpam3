package com.azarenko.model;

public class MirrorPage extends Page {
    private String email;
    private boolean archives;
    private boolean paid;

    public MirrorPage() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isArcives() {
        return archives;
    }

    public void setArcives(boolean arcives) {
        this.archives = arcives;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public MirrorPage(String title) {
        super(title);
    }
}
