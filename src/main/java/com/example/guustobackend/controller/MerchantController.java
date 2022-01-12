package com.example.guustobackend.controller;

import com.example.guustobackend.domain.model.Merchant;
import com.example.guustobackend.service.GenericService;
import com.example.guustobackend.service.impl.MerchantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("api/merchant")
public class MerchantController extends GenericRestController<Merchant, Long> {

    @Autowired
    private MerchantServiceImpl service;

    public MerchantController(GenericService<Merchant, Long> service) {
        super(service);
    }

    @GetMapping(path = "/find-by-filter")
    public ResponseEntity<List<Merchant>> findByNameCountry(@RequestParam(value = "name", required = false) String name,
                                                            @RequestParam(value = "country", required = false) String country) {
        return new ResponseEntity<>(this.service.findMerchantByEnterpriseNameAndCompanyName(name, country), HttpStatus.OK);
    }

}
