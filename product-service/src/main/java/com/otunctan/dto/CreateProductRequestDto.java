package com.otunctan.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CreateProductRequestDto {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    private BigDecimal price;


}
