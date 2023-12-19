package com.otunctan.dto.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class CreateProductResponseDto {

    private String id;

    private String code;

    private String name;

    private String description;

    private BigDecimal price;



}
