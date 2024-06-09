package com.gt.MarketApp.domain.repository;

import com.gt.MarketApp.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    public List<Product> getAll();

    Optional<List<Product>> getByCategory(int categoryId);

    Optional<List<Product>> getScarseProducts(int quantity);

    Optional<Product> getProduct(int productId);

    Product save (Product product);

    void delete (int  productId);

}
