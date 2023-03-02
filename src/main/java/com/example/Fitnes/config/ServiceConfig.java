package com.example.Fitnes.config;

import com.example.Fitnes.dao.api.IAdminDao;
import com.example.Fitnes.dao.api.IProductDao;
import com.example.Fitnes.dao.api.IUserDao;
import com.example.Fitnes.service.AdminService;
import com.example.Fitnes.service.ProductService;
import com.example.Fitnes.service.UserService;
import com.example.Fitnes.service.api.IAdminService;
import com.example.Fitnes.service.api.IProductService;
import com.example.Fitnes.service.api.IUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public IUserService userService(IUserDao dao){
        return new UserService(dao);
    }
    @Bean
    public IAdminService adminService(IAdminDao adminDao){
        return new AdminService(adminDao);
    }
    @Bean
    public IProductService productService(IProductDao productDao){
        return new ProductService(productDao);
    }

}
