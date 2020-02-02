package src.pl.edu.wszib.services.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import pl.edu.wszib.dao.IProductDAO;

import pl.edu.wszib.model.Product;

import pl.edu.wszib.services.IProductService;
import src.pl.edu.wszib.configuration.AppConfigurationTest;

import java.util.ArrayList;
import java.util.List;


import static org.mockito.ArgumentMatchers.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =  {AppConfigurationTest.class})
@WebMvcTest
public class ProductServiceImplTest {

    @Autowired
    IProductService productService;

    @MockBean
    IProductDAO productDAO;

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void getProduct() {
        Product product = new Product();
        product.setId(1);
        product.setName("Milk");
        product.setCategory("Dairy");
        product.setQuantity(12);
        product.setPrice(2);
        product.setALARM(10);

        Mockito.when(this.productDAO.getProduct(anyInt())).thenReturn(new Product(1,"safafa","fasfa",12,41,1));
        Product result = this.productService.getProduct(1);
        Assert.assertNotNull(result);

    }

    @Test
    public void getAllProducts() {
        List<Product> getAllProducts = new ArrayList<>();
        Product product = new Product();

        product.setId(1);
        product.setName("Milk");
        product.setCategory("Dairy");
        product.setQuantity(12);
        product.setPrice(2);
        product.setALARM(10);

        Product product1 = new Product();
        product1.setId(2);
        product1.setName("Milk");
        product1.setCategory("Dairy");
        product1.setQuantity(12);
        product1.setPrice(2);
        product1.setALARM(10);

        Product product2 = new Product();
        product2.setId(3);
        product2.setName("Milk");
        product2.setCategory("Dairy");
        product2.setQuantity(12);
        product2.setPrice(2);
        product2.setALARM(10);

        Product product3 = new Product();

        product3.setId(4);
        product3.setName("Milk");
        product3.setCategory("Dairy");
        product3.setQuantity(12);
        product3.setPrice(2);
        product3.setALARM(10);

        Mockito.when(productDAO.getAllProducts()).thenReturn(getAllProducts);


        List result = this.productDAO.getAllProducts();
        Assert.assertEquals(result, productDAO.getAllProducts());
    }
}

