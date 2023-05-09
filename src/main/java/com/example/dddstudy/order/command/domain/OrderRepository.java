package com.example.dddstudy.order.command.domain;

public interface OrderRepository {
    Order findByNumber(OrderNo number);
    void save(Order order);
    void delete(Order order);
}
