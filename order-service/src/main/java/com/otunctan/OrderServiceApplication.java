package com.otunctan;

import com.otunctan.clients.ProductServiceClient;
import com.otunctan.dto.order.CreateOrderRequestDto;
import com.otunctan.dto.product.CreateProductRequestDto;
import com.otunctan.dto.product.CreateProductResponseDto;
import com.otunctan.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableFeignClients
public class OrderServiceApplication {


    private final OrderService orderService;

    private final ProductServiceClient productServiceClient;

    public OrderServiceApplication(OrderService orderService, ProductServiceClient productServiceClient) {
        this.orderService = orderService;
        this.productServiceClient = productServiceClient;
    }

    @Bean
    CommandLineRunner createOrders() {
        return (args -> {
            CreateOrderRequestDto request = new CreateOrderRequestDto();
            request.setTitle("Deneme Alışveriş");
            request.setAmount(BigDecimal.valueOf(500.0));

            orderService.createOrder(request);
        });
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
