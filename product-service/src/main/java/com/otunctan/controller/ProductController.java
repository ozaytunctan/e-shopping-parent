package com.otunctan.controller;


import com.otunctan.dto.CreateProductRequestDto;
import com.otunctan.dto.CreateProductResponseDto;
import com.otunctan.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/products")
public class ProductController {


    private final ProductService productService;

    @PostMapping()
    public CreateProductResponseDto createProduct(@RequestBody @Valid CreateProductRequestDto request) {
        return productService.create(request);
    }


}
