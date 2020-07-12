package com.marketshare.productcrud.validator;

import com.marketshare.productcrud.validator.Validator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ValidatorTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void validateStringNullValueTest() {
        String field = "name";
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be null");
        Validator.validateString(null, field);
    }

    @Test
    public void validateStringEmptyValueTest() {
        String field = "name";
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be empty");
        Validator.validateString("", field);
    }

    @Test
    public void validateStringEmptyWithSpaceTest() {
        String field = "name";
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Field " + field + " cannot be empty");
        Validator.validateString("             ", field);
    }
}
