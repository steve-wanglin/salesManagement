package com.linsuo.repository;

import com.linsuo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by stevewang on 29/11/2017.
 */
public interface ProductRepository extends JpaRepository<Product,Integer>{
}
