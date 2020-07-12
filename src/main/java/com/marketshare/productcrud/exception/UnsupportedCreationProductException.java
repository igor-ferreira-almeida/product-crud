package com.marketshare.productcrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedCreationProductException extends RuntimeException {

    public UnsupportedCreationProductException(String message) {
        super(message);
    }
}
