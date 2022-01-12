package com.example.guustobackend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "MERCHANT")
public class Merchant {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "ENTERPRISE_NAME")
    private String enterpriseName;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "INITIAL_VALUE")
    private Double initialValue;

    @Column(name = "FINAL_VALUE")
    private Double finalValue;

    @Column(name = "IMG_LOGO")
    private String imgLogo;

    @ManyToOne
    private Company company;

    @ManyToOne
    private Country country;

}
