package io.agomosodev.productmanagementapi.service;

import java.util.List;

import io.agomosodev.productmanagementapi.dto.ProductCreateDto;
import io.agomosodev.productmanagementapi.dto.ProductDto;

public interface ProductService {
    ProductDto createProduct(ProductCreateDto dto);
    ProductDto getProductById(Long id);
    List<ProductDto> getAllProducts();
    ProductDto updateProduct(Long id, ProductCreateDto dto);
    void deleteProduct(Long id);
}