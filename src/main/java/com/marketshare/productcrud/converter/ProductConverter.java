package com.marketshare.productcrud.converter;

import com.marketshare.productcrud.domain.Product;
import com.marketshare.productcrud.dto.ProductDTO;

import java.util.List;
import java.util.stream.Collectors;

public class ProductConverter {

    public static Product toDomain(ProductDTO productDTO) {
        Product product = new Product();

        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setBrand(productDTO.getBrand());
        product.setPrice(productDTO.getPrice());

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

    public static List<Product> toDomainList(List<ProductDTO> dtos) {
        return dtos.stream().map(dto -> toDomain(dto)).collect(Collectors.toList());
    }

    public static List<ProductDTO> toDTOList(List<Product> domains) {
        return domains.stream().map(domain -> toDTO(domain)).collect(Collectors.toList());
    }
}
