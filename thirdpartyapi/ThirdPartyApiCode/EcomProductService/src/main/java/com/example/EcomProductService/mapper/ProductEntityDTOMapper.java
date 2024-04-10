package com.example.EcomProductService.mapper;

import com.example.EcomProductService.dto.ProductResponseDTO;
import com.example.EcomProductService.entity.Product;

public class ProductEntityDTOMapper {
    public static ProductResponseDTO convertProductEntityToProductResponseDTO(Product product)
    {
        ProductResponseDTO responseDTO=new ProductResponseDTO();
        responseDTO.setProductId(product.getId());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setCategory(product.getCategory());
       responseDTO.setRating(product.getRating());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setImgURL(product.getImgURL());
        responseDTO.setDescription(product.getDescription());
        return responseDTO;

    }
}
