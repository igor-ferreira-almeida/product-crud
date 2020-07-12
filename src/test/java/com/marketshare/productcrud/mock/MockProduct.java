package com.marketshare.productcrud.mock;

import com.marketshare.productcrud.domain.Product;
import com.marketshare.productcrud.dto.ProductDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MockProduct {
    public Product mockDomain() {
        return mockDomain(0);
    }

    public ProductDTO mockDTO() {
        return mockDTO(0);
    }

    private Product mockDomain(Integer number) {
        Product product = new Product();

        product.setId(Long.parseLong(number.toString()));
        product.setName("Name " + number);
        product.setDescription("Description " + number);
        product.setBrand("Brand " + number);
        product.setCreationDate(LocalDateTime.of(2020, 7, 11, 18, 58));
        product.setPrice(new BigDecimal("25.5"));

        return product;
    }

    private ProductDTO mockDTO(Integer number) {
        ProductDTO productDTO = new ProductDTO();

        productDTO.setId(Long.parseLong(number.toString()));
        productDTO.setName("Name " + number);
        productDTO.setDescription("Description " + number);
        productDTO.setBrand("Brand " + number);
        productDTO.setPrice(new BigDecimal("25.5"));

        return productDTO;
    }

    public List<Product> mockDomainList() {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            products.add(mockDomain(i));
        }
        return products;
    }

    public List<ProductDTO> mockDTOList() {
        List<ProductDTO> productsDTO = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            productsDTO.add(mockDTO(i));
        }
        return productsDTO;
    }
}
