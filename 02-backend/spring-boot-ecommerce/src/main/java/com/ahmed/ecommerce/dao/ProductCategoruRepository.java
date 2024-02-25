package com.ahmed.ecommerce.dao;

import com.ahmed.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product-category")
public interface ProductCategoruRepository extends JpaRepository<ProductCategory,Long> {
}
