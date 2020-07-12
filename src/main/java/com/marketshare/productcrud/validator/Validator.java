package com.marketshare.productcrud.validator;

import java.util.function.Predicate;

public class Validator {
    protected static Predicate<Object> isNull = value -> value == null;
    protected static Predicate<String> isEmpty = value -> value.trim().isEmpty();

    public static void validateString(String string, String attribute) {
        if(isNull.test(string)) {
            throw new IllegalArgumentException("Field " + attribute + " cannot be null");
        }

        if(isEmpty.test(string)) {
            throw new IllegalArgumentException("Field " + attribute + " cannot be empty");
        }
    }
}
