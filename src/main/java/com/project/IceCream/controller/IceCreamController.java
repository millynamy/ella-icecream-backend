package com.project.IceCream.controller;

import com.project.IceCream.controller.messages.OrderResponse;
import com.project.IceCream.model.*;
import com.project.IceCream.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@CrossOrigin
@RestController
@RequestMapping("icecream")
public class IceCreamController {

    @Autowired
    FlavorService flavorService;

    @Autowired
    ContainerService containerService;

    @Autowired
    ToppingService toppingService;

    @Autowired
    PricingService pricingService;

    @Autowired
    OrderService orderService;

    @GetMapping(value = "/", produces = "application/json")
    public String home() {
        return "Welcome to the Icecream Shop";
    }


    @GetMapping(value = "/flavors", produces = "application/json")
    public ArrayList<String> getFlavors() {
        return flavorService.getFlavors();
    }

    @GetMapping(value = "/containers", produces = "application/json")
    public ArrayList<String> getContainer() {
        return containerService.getContainer();
    }

    @GetMapping(value = "/toppings", produces = "application/json")
    public ArrayList<String> getTopping() {
        return toppingService.getTopping();
    }

    @GetMapping(value = "/prices/toppings", produces = "application/json")
    public HashMap<Topping, Double> getToppingPricing() {
        return pricingService.getToppingPricing();
    }

    @GetMapping(value = "/prices/containers", produces = "application/json")
    public HashMap<Container, Double> getContainerPricing(){
        return pricingService.getContainerPricing();
    }

    @GetMapping(value = "/prices/flavors", produces = "application/json")
    public HashMap<Flavor, Double> getFlavorPricing(){
        return pricingService.getFlavorPricing();
    }

    @PostMapping(value = "/icecream/order", produces = "application/json")
    public OrderResponse iceCreamOrder(Order order){
        return orderService.createOrder(order);
    }
}
