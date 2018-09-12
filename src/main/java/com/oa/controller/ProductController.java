package com.oa.controller;
import com.oa.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @RequestMapping("/addProduct")
    public ModelAndView add(Product product) throws Exception{
        ModelAndView mav=new ModelAndView("showProduct");
        return mav;
    }

}
