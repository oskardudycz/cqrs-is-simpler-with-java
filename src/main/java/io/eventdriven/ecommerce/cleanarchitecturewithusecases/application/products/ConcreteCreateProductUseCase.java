package io.eventdriven.ecommerce.cleanarchitecturewithusecases.application.products;

import io.eventdriven.ecommerce.cleanarchitecturewithusecases.application.products.commands.CreateProductCommand;
import io.eventdriven.ecommerce.cleanarchitecturewithusecases.application.products.dtos.ProductDTO;

class ConcreteCreateProductUseCase implements CreateProductUseCase {
  private final ProductGateway productGateway;
  private final ProductDTOMapper productDTOMapper;

  public ConcreteCreateProductUseCase(
    ProductGateway productGateway,
    ProductDTOMapper productFactory
  ) {
    this.productGateway = productGateway;
    this.productDTOMapper = productFactory;
  }

  @Override
  public ProductDTO create(CreateProductCommand createProductDTO) {
    var productExists = productGateway.productExists(createProductDTO.productId());

    if (productExists) {
      throw new RuntimeException(
        "Product with id '%s%' already exists"
          .formatted(createProductDTO.productId().value()));
    }

    productGateway.save(
      productDTOMapper.map(createProductDTO)
    );

    var newProduct = productGateway.findById(createProductDTO.productId()).get();

    return productDTOMapper.mapToProductDTO(newProduct);
  }
}
