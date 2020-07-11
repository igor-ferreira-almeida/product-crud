package com.marketshare.productcrud.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    @Getter
    @Setter
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Getter
    @Setter
    @Column(name = "NAME")
    private String name;

    @Getter
    @Setter
    @Column(name = "DESCRIPTION")
    private String description;

    @Getter
    @Setter
    @Column(name = "BRAND")
    private String brand;

    @Getter
    @Setter
    @Column(name = "PRICE")
    private BigDecimal price;

    @Getter
    @Setter
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

}
