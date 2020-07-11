package com.marketshare.productcrud.service;

import com.marketshare.productcrud.converter.ProductConverter;
import com.marketshare.productcrud.domain.Product;
import com.marketshare.productcrud.dto.ProductDTO;
import com.marketshare.productcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductDTO save(ProductDTO productDTO) {
        Product product = ProductConverter.toDomain(productDTO);
        product.setCreationDate(LocalDateTime.now());
        Product savedProduct = productRepository.save(product);
        productDTO.setId(savedProduct.getId());

        return productDTO;
    }
}
