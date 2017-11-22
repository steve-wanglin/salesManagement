package com.linsuo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by stevewang on 17/10/2017.
 */
@Entity
public class Customer {

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Double getVolumeAmount() {
        return VolumeAmount;
    }

    public void setVolumeAmount(Double volumeAmount) {
        VolumeAmount = volumeAmount;
    }

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private Long mobileNumber;
    private Double VolumeAmount;
}
