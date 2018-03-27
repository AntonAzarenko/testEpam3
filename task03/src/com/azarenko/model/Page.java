package com.azarenko.model;

public abstract class Page {
    private String title;
    private String type;
    private boolean authorize;
    private boolean news;
    private String email;
    private boolean archives;
    private boolean paid;
    private boolean vote;
    private boolean voteauthorize;

    public boolean isArchives() {
        return archives;
    }

    public void setArchives(boolean archives) {
        this.archives = archives;
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

    public boolean isAuthorize() {
        return authorize;
    }

    public void setAuthorize(boolean authorize) {
        this.authorize = authorize;
    }

    public boolean isNews() {
        return news;
    }

    public void setNews(boolean news) {
        this.news = news;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Page(String title) {
        this.title = title;
    }


    public Page() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
