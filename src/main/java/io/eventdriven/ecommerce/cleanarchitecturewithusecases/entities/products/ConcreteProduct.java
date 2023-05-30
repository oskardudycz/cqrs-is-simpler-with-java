package io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products;

import io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products.Product;
import io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products.ProductId;
import io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products.SKU;
import jakarta.persistence.Column;

import java.util.Optional;

class ConcreteProduct implements Product {
  private io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products.ProductId productId;
  private io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products.SKU sku;
  @Column
  private String name;
  @Column
  private String description;

  public ConcreteProduct(
    io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products.ProductId productId,
    io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products.SKU sku,
    String name,
    String description
  ) {
    this.productId = productId;
    this.sku = sku;
    this.name = name;
    this.description = description;
  }

  @Override
  public ProductId getProductId() {
    return productId;
  }

  @Override
  public io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products.SKU getSKU() {
    return sku;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Optional<String> getDescription() {
    return Optional.ofNullable(description);
  }

  @Override
  public void setSKU(SKU sku) {

  }

  @Override
  public void setName(String name) {

  }

  @Override
  public void setDescription(String description) {

  }
}
