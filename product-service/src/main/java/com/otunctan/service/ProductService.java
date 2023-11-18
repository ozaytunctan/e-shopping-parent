package com.otunctan.service;

import com.otunctan.dto.CreateProductRequestDto;
import com.otunctan.dto.CreateProductResponseDto;

public interface ProductService {

     CreateProductResponseDto create(CreateProductRequestDto request);

}
