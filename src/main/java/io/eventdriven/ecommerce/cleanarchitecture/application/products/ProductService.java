package io.eventdriven.ecommerce.cleanarchitecture.application.products;

import io.eventdriven.ecommerce.cleanarchitecture.application.products.dtos.*;

import java.util.List;

public interface ProductService {
  ProductDTO create(CreateProductDTO createProductDTO);
  ProductDTO update(UpdateProductDTO createProductDTO);
  ProductDTO findById(FindProductByIdDTO filterProductsDTO);
  List<ProductShortInfoDTO> filterProducts(FilterProductsDTO filterProductsDTO);
}
