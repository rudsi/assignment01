package com.scraper.linkedinscraper.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.scraper.linkedinscraper.config.DatabaseConfig;
import com.scraper.linkedinscraper.model.Company;

public class CompanyDAO {

    public static void insertCompany(Company company) {
        String sql = "INSERT INTO companies (company_name, universal_name_id, background_cover_image_url, "
                + "linkedin_internal_id, profile_photo, industry, location, follower_count, tagline, "
                + "company_size_on_linkedin, about, website, industries, company_size, headquarters, type, "
                + "founded, specialties) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = DatabaseConfig.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, company.getCompanyName());
            pstmt.setString(2, company.getUniversalNameId());
            pstmt.setString(3, company.getBackgroundCoverImageUrl());
            pstmt.setString(4, company.getLinkedinInternalId());
            pstmt.setString(5, company.getProfilePhoto());
            pstmt.setString(6, company.getIndustry());
            pstmt.setString(7, company.getLocation());
            pstmt.setString(8, company.getFollowerCount());
            pstmt.setString(9, company.getTagline());
            pstmt.setString(10, company.getCompanySizeOnLinkedin());
            pstmt.setString(11, company.getAbout());
            pstmt.setString(12, company.getWebsite());
            pstmt.setString(13, company.getIndustries());
            pstmt.setString(14, company.getCompanySize());
            pstmt.setString(15, company.getHeadquarters());
            pstmt.setString(16, company.getType());
            pstmt.setString(17, company.getFounded());
            pstmt.setString(18, company.getSpecialties());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Company inserted successfully.");
            } else {
                System.out.println("Failed to insert company.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}