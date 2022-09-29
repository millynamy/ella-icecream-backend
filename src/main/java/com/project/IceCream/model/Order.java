package com.project.IceCream.model;

import java.util.ArrayList;

public class Order {
    ArrayList<IceCream> iceCreams;
    Delivery deliveryOptions;
    Pricing pricing;
    double orderPrice;
    int orderId;

    public Order(int orderId){
        setOrderId(orderId);
        this.pricing = new Pricing();
    }

    public int getOrderId() {

        return orderId;
    }
    public void setOrderId(int orderId){

        this.orderId = orderId;
    }

    public ArrayList<IceCream> getIceCreams() {

        return iceCreams;
    }

    public void setIceCreams(ArrayList<IceCream> iceCreams) {

        this.iceCreams = iceCreams;
    }

    public Delivery getDeliveryOptions() {

        return deliveryOptions;
    }

    public void setDeliveryOptions(Delivery deliveryOptions) {

        this.deliveryOptions = deliveryOptions;
    }

    public Pricing getPricing() {

        return pricing;
    }

    public void setPricing(Pricing pricing) {

        this.pricing = pricing;
    }
}
