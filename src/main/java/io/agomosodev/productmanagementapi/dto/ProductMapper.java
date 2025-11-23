package io.agomosodev.productmanagementapi.dto;

import java.util.Objects;

import io.agomosodev.productmanagementapi.model.Product;

public final class ProductMapper {

    private ProductMapper() {}

    public static ProductDto toDto(Product p) {
        if (p == null) return null;
        return new ProductDto(p.getId(), p.getName(), p.getDescription(), p.getPrice());
    }

    public static Product toEntity(ProductCreateDto dto) {
        if (dto == null) return null;
        Product p = new Product();
        p.setName(dto.getName());
        p.setDescription(dto.getDescription());
        p.setPrice(dto.getPrice());
        return p;
    }

    public static void updateEntityFromDto(ProductCreateDto dto, Product entity) {
        if (dto == null || entity == null) return;
        if (!Objects.equals(entity.getName(), dto.getName())) entity.setName(dto.getName());
        if (!Objects.equals(entity.getDescription(), dto.getDescription())) entity.setDescription(dto.getDescription());
        if (!Objects.equals(entity.getPrice(), dto.getPrice())) entity.setPrice(dto.getPrice());
    }

}
