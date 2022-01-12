package com.example.guustobackend.controller;

import com.example.guustobackend.domain.model.Company;
import com.example.guustobackend.service.GenericService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/company")
public class CompanyController extends GenericRestController<Company, Long> {

    public CompanyController(GenericService<Company, Long> service) {
        super(service);
    }
}
