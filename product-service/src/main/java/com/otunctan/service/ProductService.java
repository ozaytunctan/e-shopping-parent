package com.otunctan.service;


import com.otunctan.dto.product.CreateProductRequestDto;
import com.otunctan.dto.product.CreateProductResponseDto;
import com.otunctan.dto.product.ProductResponseDto;

public interface ProductService {

     CreateProductResponseDto create(CreateProductRequestDto request);

     ProductResponseDto getProductById(String productId);
}
