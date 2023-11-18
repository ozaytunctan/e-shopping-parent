package com.otunctan.mapper;


import com.otunctan.document.Product;
import com.otunctan.dto.CreateProductResponseDto;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    CreateProductResponseDto productDtoToCreateProductResponseDto(Product product);
}
