package com.otunctan.service;


import com.otunctan.dto.order.CreateOrderRequestDto;
import com.otunctan.dto.order.CreateOrderResponseDto;
import com.otunctan.dto.product.ProductResponseDto;

public interface OrderService {

    CreateOrderResponseDto createOrder(CreateOrderRequestDto request);

    ProductResponseDto getProductById(String productId);
}
