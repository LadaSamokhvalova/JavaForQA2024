package ru.shop.service;

import ru.shop.model.Product;
import ru.shop.model.ProductType;
import ru.shop.repository.IProductRepository;
import ru.shop.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    private final IProductRepository productRepository ;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void Save(Product product){
        productRepository.Save(product);
    }

    public List<Product> findByProductType(ProductType productType){
        return productRepository.FindAll().stream()
                .filter(it -> it.getProducttype() == productType)
                .toList();
    }

    public  List<Product> findAll(){
        return productRepository.FindAll();
    }

}
