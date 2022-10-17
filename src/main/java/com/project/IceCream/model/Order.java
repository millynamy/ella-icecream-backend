package com.project.IceCream.model;

import javax.persistence.*;
import java.util.ArrayList;
@Entity
public class Order {
    ArrayList<IceCream> iceCreams;
    Delivery deliveryOptions;
    double orderPrice;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    Long orderId;

    public Order(){
    }

    public Long getOrderId() {

        return orderId;
    }
    public void setOrderId(Long orderId){
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
}
