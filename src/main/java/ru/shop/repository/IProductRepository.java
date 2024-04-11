package ru.shop.repository;

import ru.shop.model.Product;

import java.util.List;

public interface IProductRepository {
    public void Save(Product product);
    public List<Product> FindAll();
}
