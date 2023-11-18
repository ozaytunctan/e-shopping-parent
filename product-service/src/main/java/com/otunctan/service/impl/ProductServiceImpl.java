package com.otunctan.service.impl;

import com.otunctan.document.Product;
import com.otunctan.dto.CreateProductRequestDto;
import com.otunctan.dto.CreateProductResponseDto;
import com.otunctan.mapper.ProductMapper;
import com.otunctan.repository.ProductRepository;
import com.otunctan.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Override
    public CreateProductResponseDto create(CreateProductRequestDto request) {
        Product product = new Product();
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setName(request.getName());
        product = productRepository.save(product);

        return this.productMapper.productDtoToCreateProductResponseDto(product);
    }
}
