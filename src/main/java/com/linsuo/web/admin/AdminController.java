package com.linsuo.web.admin;

import com.linsuo.domain.ExceptionMsg;
import com.linsuo.domain.ResponseData;
import com.linsuo.entity.Admin;
import com.linsuo.service.UserInfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by stevewang on 17/10/2017.
 */


@Controller
@RequestMapping(value = "/")
public class AdminController {


    @Autowired
    public UserInfoService userInfoService;

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, Map<String, Object> map) throws Exception{
//            System.out.println("HomeController.login()");
//            // 登录失败从request中获取shiro处理的异常信息。
//            // shiroLoginFailure:就是shiro异常类的全类名.
//            String exception = (String) request.getAttribute("shiroLoginFailure");
//            System.out.println("exception=" + exception);
//            String msg = "";
//            if (exception != null) {
//                if (UnknownAccountException.class.getName().equals(exception)) {
//                    System.out.println("UnknownAccountException -- > 账号不存在：");
//                    msg = "UnknownAccountException -- > 账号不存在：";
//                } else if (IncorrectCredentialsException.class.getName().equals(exception)) {
//                    System.out.println("IncorrectCredentialsException -- > 密码不正确：");
//                    msg = "IncorrectCredentialsException -- > 密码不正确：";
//                } else if ("kaptchaValidateFailed".equals(exception)) {
//                    System.out.println("kaptchaValidateFailed -- > 验证码错误");
//                    msg = "kaptchaValidateFailed -- > 验证码错误";
//                } else {
//                    msg = "else >> "+exception;
//                    System.out.println("else -- >" + exception);
//                }
//            }
//            map.put("msg", msg);
//            // 此方法不处理登录成功,由shiro进行处理
        return  "extra-signin";
    }



    @RequestMapping(value="ajaxLogin",method= RequestMethod.POST)
    @ResponseBody
    public ResponseData submitLogin(@ModelAttribute Admin inputAdmin) {

            ResponseData responseData=new ResponseData();
//        if(vcode==null||vcode==""){
//            resultMap.put("status", 500);
//            resultMap.put("message", "验证码不能为空！");
//            return resultMap;
//        }

        Session session = SecurityUtils.getSubject().getSession();
        //转化成小写字母


        try {
            UsernamePasswordToken token = new UsernamePasswordToken(inputAdmin.getUserName(), inputAdmin.getPassword(),true);
            SecurityUtils.getSubject().login(token);


            return new ResponseData(ExceptionMsg.SUCCESS.getCode(),ExceptionMsg.SUCCESS.getMsg());
        } catch (Exception e) {


            return  new ResponseData(ExceptionMsg.FAILED.getCode(),e.getMessage());
        }
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
