package com.marketshare.productcrud.handler;

import com.marketshare.productcrud.exception.UnsupportedCreationProductException;
import com.marketshare.productcrud.response.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizerExceptionMessageHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handlerAllExceptions(Exception e, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(e.getMessage(), request.getDescription(false), new Date());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UnsupportedCreationProductException.class)
    public final ResponseEntity<ExceptionResponse> handlerBadRequestExceptions(Exception e, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(e.getMessage(), request.getDescription(false), new Date());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
