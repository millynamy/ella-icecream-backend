package com.project.IceCream.model;

import java.util.ArrayList;
public class IceCream {
    ArrayList<Topping> toppings;
    ArrayList<Flavor> flavors;
    ArrayList<Container> containers;

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }

    public ArrayList<Flavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(ArrayList<Flavor> flavors) {
        this.flavors = flavors;
    }

    public ArrayList<Container> getContainers() {
        return containers;
    }

    public void setContainers(ArrayList<Container> containers) {
        this.containers = containers;
    }

}
