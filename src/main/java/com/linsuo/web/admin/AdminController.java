package com.linsuo.web.admin;

import com.linsuo.entity.Admin;
import com.linsuo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by stevewang on 17/10/2017.
 */


@Controller
@RequestMapping(value = "/")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @RequestMapping(value = "/login")
    public String  login(){
        return  "extra-signin";
    }

    @RequestMapping(value = "")
    public String  home(){
        return  "index";
    }


    //The below one use to do API verify .
    /**
    @ResponseBody
    @RequestMapping(value="/doLogin",method = RequestMethod.POST)
    public String doLogin(@ModelAttribute Admin inputAdmin){

        String loginStatus="failed";

        System.out.println("long verification");

        System.out.println("the admin username is:"+inputAdmin.getUserName());
        System.out.println("the admin username is:"+inputAdmin.getPassword());

        Admin admin=adminRepository.findAdminByUserNameAndPassword(inputAdmin.getUserName(),inputAdmin.getPassword());
        if(admin!=null){
            loginStatus="success";

        }
        return loginStatus;

    }
    **/

}
