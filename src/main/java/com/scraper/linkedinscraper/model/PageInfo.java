package com.scraper.linkedinscraper.model;

import java.util.List;

public class PageInfo {
    private Long id;
    private String name;
    private String industry;
    private int followers;
    private int following;
    private List<Update> posts;

    public PageInfo() {
    }

    public PageInfo(Long id, String name, String industry, int followers, int following) {
        this.id = id;
        this.name = name;
        this.industry = industry;
        this.followers = followers;
        this.following = following;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public List<Update> getPosts() {
        return posts;
    }

    public void setPosts(List<Update> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                ", followers=" + followers +
                ", following=" + following +
                '}';
    }
}
