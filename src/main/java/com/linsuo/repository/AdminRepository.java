package com.linsuo.repository;

import com.linsuo.entity.Admin;
import org.springframework.data.repository.Repository;

/**
 * Created by stevewang on 18/10/2017.
 */
public interface AdminRepository extends Repository<Admin,Long> {

    Admin findAdminByUserNameAndPassword(String userName,String password);

}
