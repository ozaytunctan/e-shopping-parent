package com.otunctan.clients;

import com.otunctan.dto.order.CreateOrderResponseDto;
import com.otunctan.dto.product.CreateProductRequestDto;
import com.otunctan.dto.product.CreateProductResponseDto;
import com.otunctan.dto.product.ProductResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("PRODUCT-SERVICE")
public interface ProductServiceClient {

    @PostMapping("/api/v1/products")
    CreateProductResponseDto crateProduct(@RequestBody  CreateProductRequestDto createProductRequest);

    @GetMapping("/api/v1/products/{productId}")
    ProductResponseDto getProductById(@PathVariable String productId);


}
