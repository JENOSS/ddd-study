package com.example.dddstudy.order.command.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ShippingInfo {
    private Receiver receiver;
    private Address address;
}
