package com.otunctan.service;

import com.otunctan.dto.CreateOrderRequestDto;
import com.otunctan.dto.CreateOrderResponseDto;

public interface OrderService {

    CreateOrderResponseDto createOrder(CreateOrderRequestDto request);

}
