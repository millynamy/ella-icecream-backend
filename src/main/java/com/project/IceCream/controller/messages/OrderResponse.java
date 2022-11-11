package com.project.IceCream.controller.messages;

public class OrderResponse {
    String message;
    String orderId;

    public OrderResponse(String message, String orderId) {
        this.message = message;
        this.orderId = orderId;
    }
}
