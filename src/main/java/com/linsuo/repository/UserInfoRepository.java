package com.linsuo.repository;

import com.linsuo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by stevewang on 05/12/2017.
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {

    public  UserInfo findUserInfoByUsername(String userName);
}
