package com.example.guustobackend.service.impl;

import com.example.guustobackend.domain.model.Merchant;
import com.example.guustobackend.repository.MerchantRepository;
import com.example.guustobackend.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl extends GenericServiceImpl<Merchant, Long> implements GenericService<Merchant, Long> {

    @Autowired
    private MerchantRepository merchantRepository;

    public List<Merchant> findMerchantByEnterpriseNameAndCompanyName(String enterpriseName, String countryName) {
        return merchantRepository.findMerchantByEnterpriseNameAndCompanyName(enterpriseName, countryName);
    }

}
