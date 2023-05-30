package io.eventdriven.ecommerce.cleanarchitecture.application.products;

import io.eventdriven.ecommerce.cleanarchitecture.entities.products.Product;
import io.eventdriven.ecommerce.cleanarchitecture.entities.products.ProductId;

import java.util.Optional;

public interface ProductGateway {
  Optional<Product> findById(ProductId product);
  void save(Product product);
}
