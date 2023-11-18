package com.otunctan.service.impl;

import com.otunctan.dto.CreateOrderRequestDto;
import com.otunctan.dto.CreateOrderResponseDto;
import com.otunctan.entity.Order;
import com.otunctan.repository.OrderRepository;
import com.otunctan.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public CreateOrderResponseDto createOrder(CreateOrderRequestDto request) {

        Order order = new Order();
        order.setAmount(request.getAmount());
        order.setQuantity(request.getQuantity());
        order.setTitle(request.getTitle());

        this.orderRepository.save(order);

        return CreateOrderResponseDto.builder()
                .amount(order.getAmount())
                .title(order.getTitle())
                .quantity(order.getQuantity())
                .build();
    }
}
