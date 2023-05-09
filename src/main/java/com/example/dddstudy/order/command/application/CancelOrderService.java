package com.example.dddstudy.order.command.application;

import com.example.dddstudy.order.NoOrderException;
import com.example.dddstudy.order.command.domain.Order;
import com.example.dddstudy.order.command.domain.OrderNo;
import com.example.dddstudy.order.command.domain.OrderRepository;

public class CancelOrderService {
    private OrderRepository orderRepository;

    public void cancel(OrderNo number) {
        Order order = orderRepository.findByNumber(number);
        if (order == null) throw new NoOrderException(number);
        order.cancel();
    }
}
