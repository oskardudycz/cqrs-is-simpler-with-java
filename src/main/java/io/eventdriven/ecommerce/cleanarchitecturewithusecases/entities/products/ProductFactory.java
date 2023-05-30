package io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products;

public interface ProductFactory {
  Product create(ProductId productId, SKU sku, String name, String password);
}
