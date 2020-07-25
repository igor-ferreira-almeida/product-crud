package com.marketshare.productcrud.controller;

import com.marketshare.productcrud.dto.ProductDTO;
import com.marketshare.productcrud.service.ProductService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Api(value = "Product", description = "Description for Product", tags = {"product endpoint", "product"})
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("{id}")
    public ResponseEntity<String> get(@PathVariable Long id) {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping
    public ResponseEntity<String> getByName(@RequestParam(value = "name", defaultValue = "") String name) {
        return ResponseEntity.ok("Hello World!");
    }

    @ApiOperation(value = "Create new product")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Bad request")})
    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ProductDTO productDTO) {
        ProductDTO createdResource = productService.save(productDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/{id}").buildAndExpand(createdResource.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}


