package com.linsuo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by stevewang on 18/10/2017.
 */
@Entity
public class Admin {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;

    public Admin() {
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
