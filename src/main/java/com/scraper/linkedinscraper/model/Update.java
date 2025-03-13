package com.scraper.linkedinscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Update {

    @JsonProperty("text")
    private String text;

    @JsonProperty("article_posted_date")
    private String articlePostedDate;

    @JsonProperty("total_likes")
    private String totalLikes;

    @JsonProperty("article_title")
    private String articleTitle;

    @JsonProperty("article_sub_title")
    private String articleSubTitle;

    @JsonProperty("article_link")
    private String articleLink;

    @JsonProperty("article_image")
    private String articleImage;

    // Getters and Setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getArticlePostedDate() {
        return articlePostedDate;
    }

    public void setArticlePostedDate(String articlePostedDate) {
        this.articlePostedDate = articlePostedDate;
    }

    public String getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(String totalLikes) {
        this.totalLikes = totalLikes;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleSubTitle() {
        return articleSubTitle;
    }

    public void setArticleSubTitle(String articleSubTitle) {
        this.articleSubTitle = articleSubTitle;
    }

    public String getArticleLink() {
        return articleLink;
    }

    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }

    public String getArticleImage() {
        return articleImage;
    }

    public void setArticleImage(String articleImage) {
        this.articleImage = articleImage;
    }
}
