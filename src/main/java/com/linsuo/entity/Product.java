package com.linsuo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Created by stevewang on 18/10/2017.
 */
@Entity
@Table(name = "product")
public class Product {

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Id
    @GeneratedValue
    private int id;
//    @Column(nullable = false)
    private char gender;
//    @Column(nullable = false)
    private double weight;
    //正宗阳澄湖大闸蟹 or 清水蟹
//    @Column(nullable = false)
    private String type;
    //产品单价
//    @Column(nullable = false)
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    private String name;
    private String shortDesc;

    @Override
    public String toString() {
        return name+": "+shortDesc+ ": "+weight+" : "+gender+ " : "+type+ " : "+ price;
    }
}
