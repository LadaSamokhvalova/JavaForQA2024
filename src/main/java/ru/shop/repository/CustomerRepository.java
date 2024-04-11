package ru.shop.repository;

import ru.shop.model.Customer;
import ru.shop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final List<Customer> customersList = new ArrayList<>();

    public void Save(Customer customer){
        customersList.add(customer);
    }
    public List<Customer> FindAll(){
        return new ArrayList<>(customersList);
    }


}
