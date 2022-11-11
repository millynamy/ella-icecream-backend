package com.project.IceCream.dao;

import com.project.IceCream.model.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class OrderDao {
    // TODO
    Map<String, Order> orderDb;

    public OrderDao() {
        this.orderDb = new HashMap<>();
    }

    public String saveOrder(Order order){
        Long orderId = Double.valueOf(Math.random()).longValue();
        order.setOrderId(orderId);

        orderDb.put(String.valueOf(orderId), order);
        return String.valueOf(orderId);
    }
}
