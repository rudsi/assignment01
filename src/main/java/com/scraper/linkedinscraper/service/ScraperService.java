package com.scraper.linkedinscraper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scraper.linkedinscraper.model.Company;

@Service
public class ScraperService {

    @Value("${scrapingdog.api.key}")
    private String api_key;

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public ScraperService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.objectMapper = new ObjectMapper();
    }

    public Company scrapeData(String linkId, String apiKey) {
        String type = "company";
        // Build the URL according to the documentation sample
        String scrapingDogUrl = "https://api.scrapingdog.com/linkedin/?api_key=" + apiKey
                + "&type=" + type + "&linkId=" + linkId;

        ResponseEntity<String> response = restTemplate.getForEntity(scrapingDogUrl, String.class);
        System.out.println("data fetched.");

        if (response.getStatusCode() == HttpStatus.OK) {
            String jsonResponse = response.getBody();
            System.out.println("Received JSON: " + jsonResponse);

            try {
                List<Company> companies = objectMapper.readValue(jsonResponse, new TypeReference<List<Company>>() {
                });
                Company company = companies.isEmpty() ? null : companies.get(0);
                if (company.getUpdates() != null && company.getUpdates().size() > 10) {
                    company.setUpdates(company.getUpdates().subList(0, 10));
                }
                return company;
            } catch (Exception e) {
                throw new RuntimeException("Failed to parse JSON response: " + e.getMessage());
            }
        } else {
            throw new RuntimeException("Failed to fetch data. Http Status: " + response.getStatusCode());
        }
    }

}
