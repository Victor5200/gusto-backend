package com.example.guustobackend.controller;

import com.example.guustobackend.domain.model.Country;
import com.example.guustobackend.service.GenericService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/country")
public class CountryController extends GenericRestController<Country, Long> {

    public CountryController(GenericService<Country, Long> service) {
        super(service);
    }

}
