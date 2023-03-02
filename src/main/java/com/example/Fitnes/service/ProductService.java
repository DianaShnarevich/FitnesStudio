package com.example.Fitnes.service;

import com.example.Fitnes.core.dto.products.ProductDTO;
import com.example.Fitnes.dao.api.IProductDao;
import com.example.Fitnes.dao.entity.ProductEntity;
import com.example.Fitnes.service.api.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private final IProductDao IProductDao;

    public ProductService(IProductDao IProductDao) {
        this.IProductDao = IProductDao;
    }

    public List<ProductEntity> getAll() {
        return null;
    }

    @Override
    public boolean save(ProductDTO productDTO) {
        ProductEntity entity = new ProductEntity(productDTO);
        IProductDao.save(entity);
        return true;
    }

}
