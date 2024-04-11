package ru.shop.service;

import ru.shop.model.Customer;
import ru.shop.model.Order;
import ru.shop.model.Product;
import ru.shop.repository.IOrderRepository;

import java.util.List;

public interface IOrderService {
    void Add(Customer _customer, Product _product, int _count);
    List<Order> findAll();
    List<Order> findByCustomer(Customer _customer);
    long getTotalCustomerAmount(Customer _customer);

}
