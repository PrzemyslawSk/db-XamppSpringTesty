package src.pl.edu.wszib.configuration;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.controller.AddController;
import pl.edu.wszib.controller.DeleteController;
import pl.edu.wszib.controller.IndexController;
import pl.edu.wszib.controller.ProductListController;

import pl.edu.wszib.dao.IProductDAO;

import pl.edu.wszib.services.IProductService;
import pl.edu.wszib.services.impl.ProductServiceImpl;


@Configuration
public class AppConfigurationTest {

    /*@Bean
    public IUserDAO userDAO() {
        return new UserDAOImplStub();
    }*/

    @Bean
    public SessionFactory hibernateSessionFactory(){
        return new org.hibernate.cfg.Configuration().configure().buildSessionFactory();

    }



    @Bean

    public IProductService productService(IProductDAO productDAO){

        return new ProductServiceImpl(productDAO);

    }

    @Bean

    public IndexController indexController(){

        return new IndexController();

    }

    @Bean

    public ProductListController productListController(){

        return new ProductListController();

    }

    @Bean

    public AddController addController(){

        return new AddController();

    }
    @Bean

    public DeleteController deleteController(){

        return new DeleteController();

    }
}






