package com.otunctan.service.impl;

import com.otunctan.clients.ProductServiceClient;
import com.otunctan.dto.order.CreateOrderRequestDto;
import com.otunctan.dto.order.CreateOrderResponseDto;
import com.otunctan.dto.product.ProductResponseDto;
import com.otunctan.entity.Order;
import com.otunctan.repository.OrderRepository;
import com.otunctan.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    private final ProductServiceClient productServiceClient;

    public OrderServiceImpl(OrderRepository orderRepository, ProductServiceClient productServiceClient) {
        this.orderRepository = orderRepository;
        this.productServiceClient = productServiceClient;
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


    @Override
    public ProductResponseDto getProductById(String productId) {
        // order servisi product servis ile konuşturduk.
        return productServiceClient.getProductById(productId);
    }


}
