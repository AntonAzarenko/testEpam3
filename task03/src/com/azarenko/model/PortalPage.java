package com.azarenko.model;

public class PortalPage extends Page {
    private boolean authorize;
    private String email;
    private boolean vote;
    private boolean voteauthorize;

    public PortalPage(String title) {
        super(title);
    }

    public PortalPage() {
    }

    public boolean isAuthorize() {

        return authorize;
    }

    public void setAuthorize(boolean authorize) {
        this.authorize = authorize;
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

    public boolean isVoteauthorize() {
        return voteauthorize;
    }

    public void setVoteauthorize(boolean voteauthorize) {
        this.voteauthorize = voteauthorize;
    }
}
