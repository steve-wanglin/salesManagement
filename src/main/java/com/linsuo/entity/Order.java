package com.linsuo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by stevewang on 18/10/2017.
 */
@Entity
@Table(name="`order`")
public class Order {
    //orderId 对应数据库表结构的设计

    @Id
    @GeneratedValue
    private long id;
    //需要打印在订单上面，并且显示
    private String orderNumber;
    private Date createdDate;
    private Date updateDate;


//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "order")
//    private List<Product> productList;
    private double orderAmt;
    private double transactionAmt;
    @OneToOne
    private Customer customer;


}
