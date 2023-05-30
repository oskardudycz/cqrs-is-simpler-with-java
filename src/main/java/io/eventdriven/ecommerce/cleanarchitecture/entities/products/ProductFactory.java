package io.eventdriven.ecommerce.cleanarchitecture.entities.products;

public interface ProductFactory {
  Product create(ProductId productId, SKU sku, String name, String password);
}
