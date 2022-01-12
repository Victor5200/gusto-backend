package com.example.guustobackend.service.impl;

import com.example.guustobackend.domain.model.Country;
import com.example.guustobackend.service.GenericService;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl extends GenericServiceImpl<Country, Long> implements GenericService<Country, Long> {

}
