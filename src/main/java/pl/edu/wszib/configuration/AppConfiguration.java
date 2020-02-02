package pl.edu.wszib.configuration;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.context.annotation.SessionScope;
import pl.edu.wszib.dao.IProductDAO;


import pl.edu.wszib.dao.impl.ProductDAOImpl;

import pl.edu.wszib.services.IProductService;
import pl.edu.wszib.services.impl.ProductServiceImpl;

@Configuration
public class AppConfiguration {

    @Bean
    public SessionFactory hibernateSessionFactory(){
        return new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
    }

    @Bean
    public IProductDAO productDAO(SessionFactory hibernateSessionFactory){
        return new ProductDAOImpl(hibernateSessionFactory);
    }

    @Bean
    public IProductService productService(IProductDAO productDAO){
        return new ProductServiceImpl(productDAO);
    }
}


