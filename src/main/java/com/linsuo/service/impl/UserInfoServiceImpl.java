package com.linsuo.service.impl;

import com.linsuo.entity.UserInfo;
import com.linsuo.repository.UserInfoRepository;
import com.linsuo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by stevewang on 05/12/2017.
 */
@Service
public class UserInfoServiceImpl implements  UserInfoService{

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
          return userInfoRepository.findUserInfoByUsername(username);
    }
}
