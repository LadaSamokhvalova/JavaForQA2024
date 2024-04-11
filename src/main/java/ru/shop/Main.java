package ru.shop;

import ru.shop.exception.BadOrderCountException;
import ru.shop.model.Customer;
import ru.shop.model.Product;
import ru.shop.model.ProductType;
import ru.shop.repository.*;
import ru.shop.service.*;

import java.util.UUID;

public class Main {
    public static final IProductRepository productRepository = new ProductRepository();
    public static final ICustomerRepository customerRepository = new CustomerRepository();
    public static final IOrderRepository orderRepository = new OrderRepository();

    public static final IProductService productService = new ProductService(productRepository);
    public static final ICustomerService customerService = new CustomerService(customerRepository);
    public static final IOrderService orderService = new OrderService(orderRepository);


    public static void main(String[] args) throws BadOrderCountException {

        var product_1 = new Product();
        product_1.setId(UUID.randomUUID());
        product_1.setName("Product1");
        product_1.setCost(7887);
        product_1.setProducttype(ProductType.GOODS);
        var product_2 = new Product();
        product_2.setId(UUID.randomUUID());
        product_2.setName("Product2");
        product_2.setCost(119);
        product_2.setProducttype(ProductType.GOODS);

        productService.Save(product_1);
        productService.Save(product_2);

        var customer_1 = new Customer();
        customer_1.setId(UUID.randomUUID());
        customer_1.setName("Ivan");
        customer_1.setAge(82);
        customer_1.setEmail("ivan@gmail.com");
        var customer_2 = new Customer();
        customer_2.setId(UUID.randomUUID());
        customer_2.setName("Evgenii");
        customer_2.setAge(24);
        customer_2.setEmail("evg@gmail.com");

        customerService.Save(customer_1);
        customerService.Save(customer_2);
        var allcustomers = customerService.findAll();

        orderService.Add(customer_1, product_1, 13);
        orderService.Add(customer_1, product_2, 1);
        orderService.Add(customer_2, product_1, 32);
        try {
            orderService.Add(customer_2, product_2, -6);
        } catch (BadOrderCountException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Количество заказчиков: " + customerService.findAll().size());
        for (Customer customer : allcustomers) {
            System.out.println("Количество заказов для заказчика "+ customer.getId() + " :" + orderService.findByCustomer(customer).size());
        }

        System.out.println("Сумма для каждого заказчика");
        for (Customer customer : allcustomers) {
            System.out.println("Сумма для заказчика "+ customer.getId() + " :" + orderService.getTotalCustomerAmount(customer));
        }
    }

}