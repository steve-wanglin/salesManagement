package com.linsuo.web.api;

import com.linsuo.domain.ResponseData;
import com.linsuo.entity.Admin;
import com.linsuo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by stevewang on 17/10/2017.
 */


@RestController(value = "apiAdminController")
@RequestMapping(value = "/api")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;


    //The below one use to do API verify .
    @RequestMapping(value="/doLogin",method = RequestMethod.POST)
    public ResponseData doLogin(@ModelAttribute Admin inputAdmin){

        Admin admin=adminRepository.findAdminByUserNameAndPassword(inputAdmin.getUserName(),inputAdmin.getPassword());
        ResponseData responseData=new ResponseData();
        if(admin==null){

            responseData.setRspCode("1");
            responseData.setRspMsg("failed");
        }
        return responseData;

    }

}
