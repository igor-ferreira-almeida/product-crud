package com.marketshare.productcrud.converter;

import com.marketshare.productcrud.domain.Product;
import com.marketshare.productcrud.dto.ProductDTO;

public class ProductConverter {

    public static Product toDomain(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setBrand(productDTO.getBrand());
        product.setPrice(product.getPrice());

        return product;
    }

    public static ProductDTO toDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();

        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setBrand(product.getBrand());
        productDTO.setPrice(product.getPrice());

        return productDTO;
    }

}
