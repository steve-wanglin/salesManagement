package com.linsuo.service;

import com.linsuo.entity.UserInfo;
import org.springframework.stereotype.Service;

/**
 * Created by stevewang on 05/12/2017.
 */
@Service
public interface UserInfoService {

    /**通过username查找用户信息;*/
     UserInfo findByUsername(String username);
}
