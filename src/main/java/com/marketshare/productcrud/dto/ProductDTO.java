package com.marketshare.productcrud.dto;

import com.marketshare.productcrud.domain.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.math.BigDecimal;

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

    public Product toDomain() {
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setBrand(brand);
        product.setPrice(price);

        return product;
    }
}
