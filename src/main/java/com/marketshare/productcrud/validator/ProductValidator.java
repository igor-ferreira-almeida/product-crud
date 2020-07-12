package com.marketshare.productcrud.validator;

import com.marketshare.productcrud.dto.ProductDTO;
import com.marketshare.productcrud.exception.UnsupportedCreationProductException;

import java.math.BigDecimal;
import java.util.function.Predicate;

public class ProductValidator {
    private static Predicate<BigDecimal> isValidPrice = price -> price.compareTo(new BigDecimal("0.0")) > 0;

    public static void validateCreation(ProductDTO productDTO) {
        validateText(productDTO.getName(), "name");
        validateText(productDTO.getDescription(), "description");
        validateText(productDTO.getBrand(), "brand");
        validatePrice(productDTO.getPrice());
    }

    private static void validateText(String text, String field) {
        try {
            Validator.validateString(text, field);
        } catch(IllegalArgumentException e) {
           throw new UnsupportedCreationProductException(e.getMessage());
        }
    }

    private static void validatePrice(BigDecimal price) {
        if(Validator.isNull.test(price)) {
            throw new UnsupportedCreationProductException("Field price cannot be null");
        }

        if(!isValidPrice.test(price)) {
            throw new UnsupportedCreationProductException("Field price cannot be less than or equal to 0");
        }
    }

}
