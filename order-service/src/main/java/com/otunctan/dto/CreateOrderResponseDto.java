package com.otunctan.dto;

import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderResponseDto {
    private String title;

    private int quantity;

    private BigDecimal amount;

}
