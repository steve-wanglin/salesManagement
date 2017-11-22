package com.linsuo.repository;

import com.linsuo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by stevewang on 17/10/2017.
 */

public interface CustomerRepository extends JpaRepository<Customer,Long> {


    Customer findByName(String name);

    Customer findCustomerByNameAndAndMobileNumber(String name,Long mobileNumber);

//    @Query("select u from Customer where  u.name=:name")
//    Customer findCustomer(@Param("name") String name);
//


}
