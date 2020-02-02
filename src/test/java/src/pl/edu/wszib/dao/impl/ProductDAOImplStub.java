package src.pl.edu.wszib.dao.impl;

import pl.edu.wszib.dao.IProductDAO;

import pl.edu.wszib.model.Product;


import java.util.List;

public class ProductDAOImplStub implements IProductDAO {
    @Override
    public void saveProduct(Product product) {

    }

    @Override
    public  void deleteProduct(Product product){

    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProduct(int id) {
        Product product = new Product();
        product.setId(1);
        product.setName("Milk");
        product.setCategory("Dairy");
        product.setQuantity(12);
        product.setPrice(2);
        product.setALARM(10);

        return product;
    }

   /* @Override
    public Product getProductByLogin(String login) {
       Product product = new Product();
        product.setId(1);
        product.setName("Milk");
        product.setCategory("Dairy");
        product.setPrice(3);
        product.setQuantity(12);
        product.setALARM(10);
        return product;
    }*/
}
