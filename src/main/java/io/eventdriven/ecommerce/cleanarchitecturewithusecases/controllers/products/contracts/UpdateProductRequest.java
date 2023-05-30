package io.eventdriven.ecommerce.cleanarchitecturewithusecases.controllers.products.contracts;

import io.eventdriven.ecommerce.cleanarchitecturewithusecases.entities.products.ProductId;
import jakarta.annotation.Nullable;

public record UpdateProductRequest(
  String name,
  @Nullable String description
) {
}
