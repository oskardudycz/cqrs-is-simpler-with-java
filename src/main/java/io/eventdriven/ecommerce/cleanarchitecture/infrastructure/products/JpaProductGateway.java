package io.eventdriven.ecommerce.cleanarchitecture.infrastructure.products;

import io.eventdriven.ecommerce.cleanarchitecture.application.products.ProductGateway;
import io.eventdriven.ecommerce.cleanarchitecture.entities.products.Product;
import io.eventdriven.ecommerce.cleanarchitecture.entities.products.ProductId;

import java.util.Optional;

public class JpaProductGateway implements ProductGateway {
  private final JpaProductRepository repository;
  private final JpaProductMapper mapper;

  public JpaProductGateway(
    JpaProductRepository repository,
    JpaProductMapper mapper
  ){
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public Optional<Product> findById(ProductId product) {
    return repository.findById(product.value())
      .map(jpaProduct -> mapper.map(jpaProduct));
  }

  @Override
  public void save(Product product) {
    repository.save(mapper.map(product));
  }
}
