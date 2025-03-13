package com.scraper.linkedinscraper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.scraper.linkedinscraper.dao.CompanyDAO;
import com.scraper.linkedinscraper.model.Company;
import com.scraper.linkedinscraper.service.ScraperService;

@RestController
@RequestMapping("/api/scrape")
public class ScraperController {

    @Autowired
    private final ScraperService scraperService;

    public ScraperController(ScraperService scraperService) {
        this.scraperService = scraperService;
    }

    @GetMapping("/{linkId}")
    public ResponseEntity<String> scrapeAndPersistCompany(@PathVariable String linkId,
            @RequestParam String apiKey) {

        System.out.println("Scraping started for linkId: " + linkId);

        Company company = scraperService.scrapeData(linkId, apiKey);

        if (company == null) {
            System.out.println("scrapeData returned null!");
            return ResponseEntity.status(500).body("Scraping failed!");
        }

        System.out.println("Scraped Company: " + company);

        CompanyDAO.insertCompany(company);

        return ResponseEntity.ok("Company scraped and persisted successfully!");
    }

}
