package com.service;

import com.data.ProductData;
import com.data.RestProductData;

public interface ProductService {

    public ProductData getProductByCode(String code);
    public void getUserDetails();
    public RestProductData getRestProductById(int id);
}
