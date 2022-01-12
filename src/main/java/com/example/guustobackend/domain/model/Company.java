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
@Entity(name = "COMPANY")
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "COMPANY_NAME")
    private String companyName;
}
