package com.otunctan;

import com.otunctan.dto.CreateOrderRequestDto;
import com.otunctan.dto.CreateOrderResponseDto;
import com.otunctan.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class OrderServiceApplication {


    private final OrderService orderService;

    public OrderServiceApplication(OrderService orderService) {
        this.orderService = orderService;
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
