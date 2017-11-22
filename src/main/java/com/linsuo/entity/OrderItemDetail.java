package com.linsuo.entity;

/**
 * Created by stevewang on 18/10/2017.
 */
public class OrderItemDetail {

    private Product product;


    //产品数量
    private int qty;

    public OrderItemDetail() {
    }


    public double getItemAmt(){
        return product.getPrice()*product.getPrice()*qty;
    }

}
