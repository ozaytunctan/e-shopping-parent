package com.otunctan.mapper;


import com.otunctan.document.Product;
import com.otunctan.dto.product.CreateProductResponseDto;
import com.otunctan.dto.product.ProductResponseDto;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    CreateProductResponseDto productDtoToCreateProductResponseDto(Product product);

    ProductResponseDto productDtoToProductResponseDto(Product product);
}
