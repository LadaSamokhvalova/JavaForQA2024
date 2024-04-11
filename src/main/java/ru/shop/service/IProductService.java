package ru.shop.service;

import ru.shop.model.Product;
import ru.shop.model.ProductType;

import java.util.List;

public interface IProductService {
    void Save(Product product);
    List<Product> findByProductType(ProductType productType);
    List<Product> findAll();
}
