package ru.shop.model;


import java.util.UUID;

public class Order {
    private UUID id;
    private UUID customer_id;
    private UUID product_id;
    private int count;
    private long amount;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(UUID customer_id) {
        this.customer_id = customer_id;
    }

    public UUID getProduct_id() {
        return product_id;
    }

    public void setProduct_id(UUID product_id) {
        this.product_id = product_id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long mount) {
        this.amount = mount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", product_id=" + product_id +
                ", count=" + count +
                ", mount=" + amount +
                '}';
    }
}
