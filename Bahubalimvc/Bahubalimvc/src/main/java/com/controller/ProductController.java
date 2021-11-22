package com.controller;

import com.data.ProductData;
import com.data.RestProductData;
import com.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @RequestMapping(method = RequestMethod.POST)
    public String getProduct(@RequestAttribute("code") String productCode, Model model) {
        ProductData productData = productServiceImpl.getProductByCode(productCode);
        model.addAttribute("product", productData);
        return "product";
    }

    @RequestMapping("/user")
    public String getUser(Model model) {
        productServiceImpl.getUserDetails();
        return "product";
    }

    @RequestMapping("/restProduct")
    public String getRestProduct(@RequestParam("id") int id, Model model) {
        RestProductData response = productServiceImpl.getRestProductById(id);
        // add rest data in model
        model.addAttribute("restProduct", response);
        return "product";
    }
}
