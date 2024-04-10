package com.example.EcomProductService.service;

import com.example.EcomProductService.dto.FakeStoreProductResponseDTO;
import com.example.EcomProductService.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProductService {

    List<FakeStoreProductResponseDTO> getAllProducts();

    Product getProduct(int productId);
    Product createProduct(Product product);

    Product updateProduct(Product updatedProduct,int productId);

    boolean deleteProduct(int productId);

}
