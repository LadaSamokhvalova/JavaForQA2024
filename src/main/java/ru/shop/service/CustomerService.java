package ru.shop.service;

import ru.shop.model.Customer;
import ru.shop.repository.CustomerRepository;
import ru.shop.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{
    private final ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository _customerRepository) {
        this.customerRepository = _customerRepository;
    }

    public void Save(Customer customer){
        customerRepository.Save(customer);
    }

    public List<Customer> findAll(){
        return customerRepository.FindAll();
    }
}
