package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/companies")
    public String getAllCompanies() {
        Iterable<Company> companies = companyRepository.findAll();
        String html = "";
        for (Company company: companies) {
            html += company + "<br>";
        }

        return html;
    }


    @PostMapping("/companies/save")
    public Iterable<Company> createGames(@RequestBody Iterable<Company> companies) {
        return companyRepository.saveAll(companies);
    }

}
