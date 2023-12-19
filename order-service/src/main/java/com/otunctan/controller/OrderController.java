package com.otunctan.controller;

import com.otunctan.dto.order.CreateOrderRequestDto;
import com.otunctan.dto.order.CreateOrderResponseDto;
import com.otunctan.dto.product.ProductResponseDto;
import com.otunctan.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {


    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping
    public CreateOrderResponseDto createOrder(@RequestBody CreateOrderRequestDto request) {
        return orderService.createOrder(request);
    }
    @GetMapping(path = "{productId}")
    public ProductResponseDto getProductById(@PathVariable String productId) {
        return orderService.getProductById(productId);
    }


}
