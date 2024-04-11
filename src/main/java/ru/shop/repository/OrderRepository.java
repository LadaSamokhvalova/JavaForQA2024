package ru.shop.repository;

import ru.shop.model.Order;
import ru.shop.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class OrderRepository implements IOrderRepository {
    private final List<Order> orderList = new ArrayList<>();
    public void Save(Order order){
        orderList.add(order);
    }
    public List<Order> FindAll(){
        return new ArrayList<>(orderList);
    }

    public List<Order> FindCustomerOrders(UUID cust_id){
        var customerOrderList = new ArrayList<Order>();
        for (Order order: orderList){
            if (Objects.equals(order.getCustomer_id(), cust_id))
            //if (order.getCustomer_id().equals(cust_id))
                customerOrderList.add(order);
        };
        return customerOrderList;
    }
}
