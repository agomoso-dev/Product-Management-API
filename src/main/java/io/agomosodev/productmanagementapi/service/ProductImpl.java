package io.agomosodev.productmanagementapi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import io.agomosodev.productmanagementapi.dto.ProductCreateDto;
import io.agomosodev.productmanagementapi.dto.ProductDto;
import io.agomosodev.productmanagementapi.dto.ProductMapper;
import io.agomosodev.productmanagementapi.model.Product;
import io.agomosodev.productmanagementapi.repository.ProductRepository;

@Service
public class ProductImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDto createProduct(ProductCreateDto dto) {
        Product product = ProductMapper.toEntity(dto);
        Product savedProduct = productRepository.save(product);
        return ProductMapper.toDto(savedProduct);
    }

    @Override
    public ProductDto getProductById(Long id) {
        Product product = productRepository.findById(id).orElse(null);
        return ProductMapper.toDto(product);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto updateProduct(Long id, ProductCreateDto dto) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) return null;
        
        ProductMapper.updateEntityFromDto(dto, product);
        Product updatedProduct = productRepository.save(product);
        return ProductMapper.toDto(updatedProduct);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}