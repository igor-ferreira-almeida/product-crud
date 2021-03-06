package com.marketshare.productcrud.dto;

import com.marketshare.productcrud.domain.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
public class ProductDTO {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private String brand;

    @Getter
    @Setter
    private BigDecimal price;
}
