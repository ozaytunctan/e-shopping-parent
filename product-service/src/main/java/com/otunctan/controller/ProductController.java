package com.otunctan.controller;

import com.otunctan.dto.product.CreateProductRequestDto;
import com.otunctan.dto.product.CreateProductResponseDto;
import com.otunctan.dto.product.ProductResponseDto;
import com.otunctan.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/v1/products")
public class ProductController {


    private final ProductService productService;

    @PostMapping()
    public CreateProductResponseDto createProduct(@RequestBody @Valid CreateProductRequestDto request) {
        return productService.create(request);
    }

    @GetMapping( "{productId}")
    public ProductResponseDto getProductById(@PathVariable String productId) {
        return productService.getProductById(productId);
    }


}
