package io.eventdriven.ecommerce.cleanarchitecture.entities.products;

import java.util.Optional;

public interface Product {
  ProductId getProductId();
  SKU getSKU();

  String getName();
  Optional<String> getDescription();

  void setSKU(SKU sku);

  void setName(String name);

  void setDescription(String description);
}
