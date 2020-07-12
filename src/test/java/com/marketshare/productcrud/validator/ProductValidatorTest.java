package com.marketshare.productcrud.validator;

import com.marketshare.productcrud.dto.ProductDTO;
import com.marketshare.productcrud.exception.UnsupportedCreationProductException;
import com.marketshare.productcrud.mock.MockProduct;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.math.BigDecimal;

public class ProductValidatorTest {

    private MockProduct inputObject;

    @Before
    public void setUp() {
        inputObject = new MockProduct();
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void validateCreationWithNameNullTest() {
        String field = "name";
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be null");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setName(null);

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithNameEmptyTest() {
        String field = "name";
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be empty");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setName("");

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithNameEmptyWithSpaceTest() {
        String field = "name";
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be empty");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setName("     ");

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithDescriptionNullTest() {
        String field = "description";
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be null");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setDescription(null);

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithDescriptionEmptyTest() {
        String field = "description";
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be empty");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setDescription("");

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithDescriptionEmptyWithSpaceTest() {
        String field = "description";
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be empty");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setDescription("     ");

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithBrandNullTest() {
        String field = "brand";
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be null");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setBrand(null);

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithBrandEmptyTest() {
        String field = "brand";
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be empty");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setBrand("");

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithBrandEmptyWithSpaceTest() {
        String field = "brand";
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be empty");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setBrand("     ");

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithPriceNullTest() {
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field price cannot be null");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setPrice(null);

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithPriceEqualToZeroTest() {
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field price cannot be less than or equal to 0");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setPrice(new BigDecimal("0"));

        ProductValidator.validateCreation(productDTO);
    }

    @Test
    public void validateCreationWithPriceLessThanZeroTest() {
        exceptionRule.expect(UnsupportedCreationProductException.class);
        exceptionRule.expectMessage("Field price cannot be less than or equal to 0");
        ProductDTO productDTO = inputObject.mockDTO();
        productDTO.setPrice(new BigDecimal("-7.0"));

        ProductValidator.validateCreation(productDTO);
    }
}
