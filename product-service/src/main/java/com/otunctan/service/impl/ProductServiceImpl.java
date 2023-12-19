package com.otunctan.service.impl;

import com.otunctan.document.Product;
import com.otunctan.dto.product.CreateProductRequestDto;
import com.otunctan.dto.product.CreateProductResponseDto;
import com.otunctan.dto.product.ProductResponseDto;
import com.otunctan.mapper.ProductMapper;
import com.otunctan.repository.ProductRepository;
import com.otunctan.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Override
    public CreateProductResponseDto create(CreateProductRequestDto request) {
        Product product = new Product();
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setName(request.getName());
        product.setCode(request.getCode());
        product = productRepository.save(product);

        return this.productMapper.productDtoToCreateProductResponseDto(product);
    }

    @Override
    public ProductResponseDto getProductById(String productId) {
        log.info("getProductById() method call  product by id {0} ", productId);

        Product product = this.productRepository.findById(productId)
                .orElseThrow(IllegalArgumentException::new);

        return this.productMapper.productDtoToProductResponseDto(product);
    }


}
