package com.azarenko.model;

public class NewsPage extends Page {
    private boolean news;
    private String email;

    public NewsPage(String title) {
        super(title);
    }



    public NewsPage() {
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
}
