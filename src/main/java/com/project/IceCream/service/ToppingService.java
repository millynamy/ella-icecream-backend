package com.project.IceCream.service;


import com.project.IceCream.model.Topping;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class ToppingService {
    public ArrayList<String> getTopping(){
        ArrayList<String> list = new ArrayList<>();
        list.add(Topping.OREOS.toString());
        list.add(Topping.SPRINKLES.toString());
        list.add(Topping.CANDY.toString());
        list.add(Topping.TWIX.toString());
        list.add(Topping.COOKIES.toString());
        Collections.sort(list);
        return list;
    }
}
