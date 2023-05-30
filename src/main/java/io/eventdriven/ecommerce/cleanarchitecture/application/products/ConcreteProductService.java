package io.eventdriven.ecommerce.cleanarchitecture.application.products;

import io.eventdriven.ecommerce.cleanarchitecture.application.products.dtos.*;

import java.util.List;

public class ConcreteProductService implements ProductService {
  @Override
  public ProductDTO create(CreateProductDTO createProductDTO) {
    return null;
  }

  @Override
  public ProductDTO update(UpdateProductDTO createProductDTO) {
    return null;
  }

  @Override
  public ProductDTO findById(FindProductByIdDTO filterProductsDTO) {
    return null;
  }

  @Override
  public List<ProductShortInfoDTO> filterProducts(FilterProductsDTO filterProductsDTO) {
    return null;
  }
}
