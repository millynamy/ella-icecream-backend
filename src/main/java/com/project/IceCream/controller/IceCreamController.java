package com.project.IceCream.controller;

import com.project.IceCream.model.Flavor;
import com.project.IceCream.model.IceCream;
import com.project.IceCream.model.Order;
import com.project.IceCream.service.ContainerService;
import com.project.IceCream.service.FlavorService;
import com.project.IceCream.service.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("icecream")
public class IceCreamController {

    @Autowired
    FlavorService flavorService;

    @Autowired
    ContainerService containerService;

    @Autowired
    ToppingService toppingService;

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

    @PostMapping(value = "/icecream/choice", produces = "application/json")
    public Order iceCreamOrder(IceCream iceCream){
        // TODO complete implementation
        return new Order();
    }


}
