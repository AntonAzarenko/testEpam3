package com.azarenko.model;

public class PortalPage extends Page {
    private String email;
    private boolean vote;
    private boolean secretballot;

    public PortalPage(String title) {
        super(title);
    }

    public PortalPage() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVote() {
        return vote;
    }

    public void setVote(boolean vote) {
        this.vote = vote;
    }

    public boolean isSecretballot() {
        return secretballot;
    }

    public void setSecretballot(boolean secretballot) {
        this.secretballot = secretballot;
    }
}
