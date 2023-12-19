package com.otunctan.dto.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
public class CreateOrderRequestDto {

    private String title;

    private int quantity;

    private BigDecimal amount;
}
