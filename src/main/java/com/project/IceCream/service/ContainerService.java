package com.project.IceCream.service;

import com.project.IceCream.model.Container;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class ContainerService {

    public ArrayList<String> getContainer(){
        ArrayList<String> list = new ArrayList<>();
        list.add(Container.SUGARCONE.toString());
        list.add(Container.WAFFLECONE.toString());
        list.add(Container.FLATCONE.toString());
        list.add(Container.PLATE.toString());
        list.add(Container.BOWL.toString());
        Collections.sort(list);
        return list;
    }
}