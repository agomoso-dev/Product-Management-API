package io.agomosodev.productmanagementapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.agomosodev.productmanagementapi.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}