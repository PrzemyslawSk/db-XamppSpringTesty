package pl.edu.wszib.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.dao.IProductDAO;
import pl.edu.wszib.model.Product;
import pl.edu.wszib.services.IProductService;

import java.util.List;

@Component
public class ProductServiceImpl implements IProductService {

@Autowired
IProductDAO productDAO;

    public ProductServiceImpl(IProductDAO productDAO) {this.productDAO=productDAO;
    }
    @Override
    public void saveProduct(Product product) {
        productDAO.saveProduct(product);
    }
    @Override
    public void deleteProduct(Product product) {
        productDAO.deleteProduct(product);
    }
    @Override
    public List<Product> getAllProducts(){
        return this.productDAO.getAllProducts();
    }
    @Override
    public Product getProduct(int id) { return this.productDAO.getProduct(id);}
}
