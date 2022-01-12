package com.example.guustobackend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "COUNTRY")
public class Country {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "COUNTRY_NAME")
    private String countryName;

}
