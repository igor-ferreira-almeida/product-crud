package com.marketshare.productcrud.dto;

import com.marketshare.productcrud.domain.Product;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
public class ProductDTO {
    @ApiModelProperty(value = "Id of Product", example = "1")
    @Getter
    @Setter
    private Long id;


    @ApiModelProperty(value = "Name of Product", example = "Product 1")
    @Getter
    @Setter
    private String name;

    @ApiModelProperty(value = "Description of Product",  example = "Description 1")
    @Getter
    @Setter
    private String description;

    @ApiModelProperty(value = "Brand of Product",  example = "Brand 1")
    @Getter
    @Setter
    private String brand;

    @ApiModelProperty(value = "Price of Product", example ="1.0")
    @Getter
    @Setter
    private BigDecimal price;
}
