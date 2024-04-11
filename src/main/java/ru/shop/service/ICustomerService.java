package ru.shop.service;

import ru.shop.model.Customer;

import java.util.List;

public interface ICustomerService {
    public void Save(Customer customer);
    public List<Customer> findAll();
}
