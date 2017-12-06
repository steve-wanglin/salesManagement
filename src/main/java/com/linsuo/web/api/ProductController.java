package com.linsuo.web.api;

import com.linsuo.domain.ExceptionMsg;
import com.linsuo.domain.Response;
import com.linsuo.entity.Product;
import com.linsuo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by stevewang on 29/11/2017.
 */
@RestController
@RequestMapping(value = "/prod")
public class ProductController extends BaseController{


    @Autowired
    ProductRepository productRepsitory;


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Response addProd(@RequestBody Product product){
        try {
            System.out.println(product);
            productRepsitory.save(product);
        }catch (Exception ex){
            return result(ExceptionMsg.FAILED);
        }
        return result();



    }

    @RequestMapping(value ="/get",method = RequestMethod.GET)
    public Product get(@PathVariable int id){
        Product product= null;
        try {
            product  = productRepsitory.findOne(id);
        }catch (Exception ex){
            logger.error(ExceptionMsg.ProductNotFound);
        }
        return product;



    }

    @RequestMapping(value ="put",method = RequestMethod.PUT)
    public Response updateProd(@ModelAttribute Product product){
        try {
            productRepsitory.save(product);
        }catch (Exception ex){
            return result(ExceptionMsg.FAILED);
        }
        return result();
    }

}
