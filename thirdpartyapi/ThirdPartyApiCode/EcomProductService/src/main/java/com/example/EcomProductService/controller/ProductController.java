package com.example.EcomProductService.controller;

import com.example.EcomProductService.dto.FakeStoreProductResponseDTO;
import com.example.EcomProductService.entity.Product;
import com.example.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ResponseEntity getAllProducts()
    {

        List<FakeStoreProductResponseDTO> products=productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
}
