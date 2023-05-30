package io.eventdriven.ecommerce.cleanarchitecture.entities.products;

import jakarta.persistence.Column;

import java.util.Optional;

class ConcreteProduct implements Product {
  private ProductId productId;
  private SKU sku;
  @Column
  private String name;
  @Column
  private String description;

  public ConcreteProduct(
    ProductId productId,
    SKU sku,
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
  public SKU getSKU() {
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
