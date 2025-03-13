package com.scraper.linkedinscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

    @JsonProperty("is_hq")
    private boolean isHq;

    @JsonProperty("office_address_line_1")
    private String officeAddressLine1;

    @JsonProperty("office_address_line_2")
    private String officeAddressLine2;

    @JsonProperty("office_location_link")
    private String officeLocationLink;

    // Getters and Setters

    public boolean isHq() {
        return isHq;
    }

    public void setHq(boolean isHq) {
        this.isHq = isHq;
    }

    public String getOfficeAddressLine1() {
        return officeAddressLine1;
    }

    public void setOfficeAddressLine1(String officeAddressLine1) {
        this.officeAddressLine1 = officeAddressLine1;
    }

    public String getOfficeAddressLine2() {
        return officeAddressLine2;
    }

    public void setOfficeAddressLine2(String officeAddressLine2) {
        this.officeAddressLine2 = officeAddressLine2;
    }

    public String getOfficeLocationLink() {
        return officeLocationLink;
    }

    public void setOfficeLocationLink(String officeLocationLink) {
        this.officeLocationLink = officeLocationLink;
    }
}
