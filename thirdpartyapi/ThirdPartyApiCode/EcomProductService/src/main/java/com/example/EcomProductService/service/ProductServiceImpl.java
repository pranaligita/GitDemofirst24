package com.example.EcomProductService.service;

import com.example.EcomProductService.dto.FakeStoreProductResponseDTO;
import com.example.EcomProductService.entity.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        return null;
    }

    @Override
    public Product getProduct(int productId) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product updatedProduct, int productId) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productId) {
        return false;
    }
}
