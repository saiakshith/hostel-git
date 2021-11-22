package com.service;

import com.dao.ProductDao;
import com.data.ProductData;
import com.data.RestProductData;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;
    private RestTemplate restTemplate;

    @Override
    public ProductData getProductByCode(String code) {
        return getProductDao().getProductByCode(code);
    }

    @Override
    public void getUserDetails() {
        productDao.showUserDetails();
    }

    @Override
    public RestProductData getRestProductById(int id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        String restUrl = "https://reqres.in/api/products/"+id;
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        ResponseEntity<RestProductData> response = restTemplate.exchange(restUrl, HttpMethod.GET, entity, RestProductData.class);
        System.out.println(response.getBody().getData().getName());
        return response.getBody();
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
