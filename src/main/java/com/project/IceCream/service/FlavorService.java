package com.project.IceCream.service;

import com.project.IceCream.model.Flavor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class FlavorService {

    public ArrayList<String> getFlavors(){
        ArrayList<String> list = new ArrayList<>();
        list.add(Flavor.CHOCOLATE.toString());
        list.add(Flavor.CARAMEL.toString());
        list.add(Flavor.COTTONCANDY.toString());
        list.add(Flavor.LEMON.toString());
        list.add(Flavor.MINT.toString());
        list.add(Flavor.STRAWBERRY.toString());
        list.add(Flavor.VANILLA.toString());
        Collections.sort(list);
        return list;
    }
}
