package com.example.guustobackend.service.impl;

import com.example.guustobackend.domain.model.Company;
import com.example.guustobackend.service.GenericService;
import com.example.guustobackend.service.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl extends GenericServiceImpl<Company, Long> implements GenericService<Company, Long> {
}
