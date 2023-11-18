package com.otunctan.controller;


import com.otunctan.dto.CreateOrderRequestDto;
import com.otunctan.dto.CreateOrderResponseDto;
import com.otunctan.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
