package ru.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shop.model.Customer;
import ru.shop.model.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {

//    List<Customer> customers = new ArrayList<>();
//
//    @Override
//    public void save(Customer customer) {
//        customers.add(customer);
//    }
//
//    @Override
//    public List<Customer> findAll() {
//        return customers;
//    }
//
//    @Override
//    public Optional<Customer> FindById(UUID id) {
//        return findAll().stream()
//                .filter(customer -> customer.getId().equals(id))
//                .findFirst();
   // }
}
