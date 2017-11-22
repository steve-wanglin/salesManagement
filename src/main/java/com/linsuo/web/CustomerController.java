package com.linsuo.web;

import com.linsuo.entity.Customer;
import com.linsuo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.logging.LogManager;

/**
 * Created by stevewang on 17/10/2017.
 */


@RestController
@RequestMapping(value = "/customer")
public class CustomerController {


    @Autowired
    private CustomerRepository repository;


    @RequestMapping(value = "/",method=RequestMethod.POST)
    public String postUser(@ModelAttribute Customer customer){

        repository.save(customer);

        return "success";

    }



/**    static Map<Long,Customer> userMap=Collections.synchronizedMap(new HashMap<Long,Customer>());
    @RequestMapping("/hello")
    public String index(){

        return "Hello World!";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Customer> getCustomerList(){
        List<Customer> list=new ArrayList<Customer>(userMap.values());

        return list;
    }

    @RequestMapping(value = "/",method=RequestMethod.POST)
    public String postUser(@ModelAttribute Customer customer){

        userMap.put(customer.getId(),customer);
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public Customer getCustomer(@PathVariable Long id){

        return userMap.get(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String putCustomer(@PathVariable Long id,@ModelAttribute Customer customer){

        Customer c=userMap.get(id);
        c.setMobileNumber(customer.getMobileNumber());
        c.setName(customer.getName());

        userMap.put(c.getId(),c);
        return "Success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id){
        userMap.remove(id);
        return "Success";

    }
**/



}
