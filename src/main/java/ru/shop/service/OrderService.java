package ru.shop.service;

import ru.shop.exception.BadOrderCountException;
import ru.shop.model.Customer;
import ru.shop.model.Order;
import ru.shop.model.Product;
import ru.shop.repository.IOrderRepository;

import java.util.List;
import java.util.UUID;

public class OrderService implements IOrderService {
    private final IOrderRepository orderRepository;

    public OrderService(IOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void Add(Customer _customer, Product _product, int _count){
        if (_count <= 0){
            throw new BadOrderCountException(_count);
        }
        else {
        var _order = new Order();
        _order.setId(UUID.randomUUID());
        _order.setCount(_count);
        _order.setProduct_id(_product.getId());
        _order.setCustomer_id(_customer.getId());
        _order.setAmount(_count * _product.getCost());

        orderRepository.Save(_order);
        }
    }

    public List<Order> findAll(){
        return orderRepository.FindAll();
    }

    public List<Order> findByCustomer(Customer _customer){
        return orderRepository.FindAll().stream()
                .filter(it -> it.getCustomer_id() == _customer.getId())
                .toList();
    }

    public long getTotalCustomerAmount(Customer _customer){
        return findByCustomer(_customer).stream()
                .mapToLong(Order::getAmount)
                .sum();

    }
}
