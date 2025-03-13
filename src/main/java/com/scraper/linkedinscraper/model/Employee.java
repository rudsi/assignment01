package com.scraper.linkedinscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    @JsonProperty("employee_photo")
    private String employeePhoto;

    @JsonProperty("employee_name")
    private String employeeName;

    @JsonProperty("employee_position")
    private String employeePosition;

    @JsonProperty("employee_profile_url")
    private String employeeProfileUrl;

    // Getters and Setters

    public String getEmployeePhoto() {
        return employeePhoto;
    }

    public void setEmployeePhoto(String employeePhoto) {
        this.employeePhoto = employeePhoto;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public String getEmployeeProfileUrl() {
        return employeeProfileUrl;
    }

    public void setEmployeeProfileUrl(String employeeProfileUrl) {
        this.employeeProfileUrl = employeeProfileUrl;
    }
}
