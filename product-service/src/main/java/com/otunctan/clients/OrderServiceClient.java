package com.otunctan.clients;


import com.otunctan.dto.order.CreateOrderResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ORDER-SERVICE")
public interface OrderServiceClient {


    @PostMapping(path = "")
    CreateOrderResponseDto createOrder(@RequestBody CreateOrderResponseDto createRequest);


}
