package com.marketshare.productcrud.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
public class ExceptionResponse implements Serializable {
    @Getter
    @Setter
    private String message;

    @Getter
    @Setter
    private String detail;

    @Getter
    @Setter
    private Date timestamp;
}
