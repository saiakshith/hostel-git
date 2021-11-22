package com.dao;

import com.data.ProductData;
import com.data.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDao {

    private JdbcTemplate jdbcTemplate;
    public ProductData getProductByCode(String code) {
        //Imagine you got below data from database
        ProductData product = new ProductData();
        product.setName("OnePlus 6");
        product.setCode("p-123");
        product.setBrand("Oneplus");
        product.setPrice(35000.00);
        return product;
    }

    public void showUserDetails() {
        String sql = "SELECT * FROM user";
        List<User> listUserData = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setAge(rs.getInt("age"));
                return user;
            }
        });

        for (User user : listUserData){
            System.out.println(user.getId() +" :: "+user.getName()+" :: "+user.getEmail()+" :: "+user.getAge());
        }
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
