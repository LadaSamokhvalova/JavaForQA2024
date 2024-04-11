package ru.shop.repository;

import ru.shop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private final List<Product> productList = new ArrayList<>();
    public void Save(Product product){
        productList.add(product);
    }
    public List<Product> FindAll(){
        return new ArrayList<>(productList);
    }

}
