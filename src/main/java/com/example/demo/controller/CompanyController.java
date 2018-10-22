package com.example.demo.controller;

import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController extends BaseRestController {
    @Autowired
    public CompanyController(CompanyRepository repo) {
        super(repo);
    }
}
