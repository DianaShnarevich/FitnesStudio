package com.example.Fitnes.service.api;

import com.example.Fitnes.core.dto.products.ProductDTO;
import com.example.Fitnes.dao.entity.ProductEntity;

import java.util.List;

public interface IProductService {
    List<ProductEntity> getAll();
    boolean add(ProductDTO productDTO);
}
