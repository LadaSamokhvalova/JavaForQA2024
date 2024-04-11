package ru.shop.repository;

import ru.shop.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    public void Save(Customer customer);
    public List<Customer> FindAll();
}
