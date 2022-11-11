package com.project.IceCream.service;

import com.project.IceCream.model.Flavor;
import com.project.IceCream.model.Pricing;
import com.project.IceCream.model.Topping;
import com.project.IceCream.model.Container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PricingService {

    @Autowired
    Pricing pricing;

    public HashMap<Container, Double> getContainerPricing(){
        return pricing.getContainerPricing();
    }
    public HashMap<Topping, Double> getToppingPricing(){
        return pricing.getToppingPricing();
    }
    public HashMap<Flavor, Double> getFlavorPricing(){
        return pricing.getFlavorPricing();
    }
}
