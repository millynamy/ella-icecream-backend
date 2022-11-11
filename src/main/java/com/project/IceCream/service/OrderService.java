package com.project.IceCream.service;

import com.project.IceCream.controller.messages.OrderResponse;
import com.project.IceCream.dao.OrderDao;
import com.project.IceCream.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    public OrderResponse createOrder(Order order){
        String orderId = orderDao.saveOrder(order);
        return new OrderResponse("Your order was created successfully", orderId);
    }

}
