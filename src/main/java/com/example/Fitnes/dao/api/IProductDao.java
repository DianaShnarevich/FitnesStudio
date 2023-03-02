package com.example.Fitnes.dao.api;

import com.example.Fitnes.dao.entity.ProductEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface IProductDao extends ListCrudRepository<ProductEntity, UUID> {
    static void add(ProductEntity entity) {
    }
}
