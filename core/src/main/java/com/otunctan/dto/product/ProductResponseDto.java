package com.otunctan.dto.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class ProductResponseDto {

    private String id;

    private String name;

    private String code;

    private String description;

    private BigDecimal price;



}