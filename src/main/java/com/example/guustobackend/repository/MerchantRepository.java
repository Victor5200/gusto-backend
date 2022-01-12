package com.example.guustobackend.repository;

import com.example.guustobackend.domain.model.Merchant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.websocket.server.PathParam;
import java.util.List;

@Repository
public interface MerchantRepository extends CrudRepository<Merchant, Long> {

    @Query("SELECT m FROM MERCHANT m WHERE (:enterpriseName is null or  m.enterpriseName like %:enterpriseName%) and" +
            "  (:countryName is null or  m.country.countryName like %:countryName%) ")
    List<Merchant> findMerchantByEnterpriseNameAndCompanyName(@PathParam("enterpriseName") String enterpriseName,
                                                              @PathParam("countryName") String countryName);

    List<Merchant> findAllByEnterpriseNameContainingAndCountryCountryNameContaining(String enterpriseName, String countryName);
}
