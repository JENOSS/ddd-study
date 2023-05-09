package com.example.dddstudy.order;

import com.example.dddstudy.order.command.domain.OrderNo;

public class NoOrderException extends RuntimeException{
    public NoOrderException(OrderNo number) {
        super(number.toString());
    }
}
