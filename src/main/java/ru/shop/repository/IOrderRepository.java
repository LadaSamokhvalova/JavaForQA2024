package ru.shop.repository;

import ru.shop.model.Order;

import java.util.List;
import java.util.UUID;

public interface IOrderRepository {
    public void Save(Order order);
    public List<Order> FindAll();
    public List<Order> FindCustomerOrders(UUID cust_id);
}
