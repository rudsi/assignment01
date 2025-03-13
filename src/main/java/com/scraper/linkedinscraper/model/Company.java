package com.scraper.linkedinscraper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("universal_name_id")
    private String universalNameId;
    @JsonProperty("background_cover_image_url")
    private String backgroundCoverImageUrl;
    @JsonProperty("linkedin_internal_id")
    private String linkedinInternalId;
    @JsonProperty("profile_photo")
    private String profilePhoto;
    @JsonProperty("industry")
    private String industry;
    @JsonProperty("location")
    private String location;
    @JsonProperty("follower_count")
    private String followerCount;
    @JsonProperty("tagline")
    private String tagline;
    @JsonProperty("company_size_on_linkedin")
    private String companySizeOnLinkedin;
    @JsonProperty("about")
    private String about;
    @JsonProperty("website")
    private String website;
    @JsonProperty("industries")
    private String industries;
    @JsonProperty("company_size")
    private String companySize;
    @JsonProperty("headquarters")
    private String headquarters;
    @JsonProperty("type")
    private String type;
    @JsonProperty("founded")
    private String founded;
    @JsonProperty("specialties")
    private String specialties;
    @JsonProperty("updates")
    private List<Update> updates;

    public Company() {
    }

    public Company(String companyName, String universalNameId, String backgroundCoverImageUrl,
            String linkedinInternalId, String profilePhoto, String industry, String location,
            String followerCount, String tagline, String companySizeOnLinkedin, String about,
            String website, String industries, String companySize, String headquarters,
            String type, String founded, String specialties) {
        this.companyName = companyName;
        this.universalNameId = universalNameId;
        this.backgroundCoverImageUrl = backgroundCoverImageUrl;
        this.linkedinInternalId = linkedinInternalId;
        this.profilePhoto = profilePhoto;
        this.industry = industry;
        this.location = location;
        this.followerCount = followerCount;
        this.tagline = tagline;
        this.companySizeOnLinkedin = companySizeOnLinkedin;
        this.about = about;
        this.website = website;
        this.industries = industries;
        this.companySize = companySize;
        this.headquarters = headquarters;
        this.type = type;
        this.founded = founded;
        this.specialties = specialties;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUniversalNameId() {
        return universalNameId;
    }

    public void setUniversalNameId(String universalNameId) {
        this.universalNameId = universalNameId;
    }

    public String getBackgroundCoverImageUrl() {
        return backgroundCoverImageUrl;
    }

    public void setBackgroundCoverImageUrl(String backgroundCoverImageUrl) {
        this.backgroundCoverImageUrl = backgroundCoverImageUrl;
    }

    public String getLinkedinInternalId() {
        return linkedinInternalId;
    }

    public void setLinkedinInternalId(String linkedinInternalId) {
        this.linkedinInternalId = linkedinInternalId;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(String followerCount) {
        this.followerCount = followerCount;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getCompanySizeOnLinkedin() {
        return companySizeOnLinkedin;
    }

    public void setCompanySizeOnLinkedin(String companySizeOnLinkedin) {
        this.companySizeOnLinkedin = companySizeOnLinkedin;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIndustries() {
        return industries;
    }

    public void setIndustries(String industries) {
        this.industries = industries;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public List<Update> getUpdates() {
        return updates;
    }

    public void setUpdates(List<Update> updates) {
        this.updates = updates;
    }
}
