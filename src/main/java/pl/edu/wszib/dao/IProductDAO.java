package pl.edu.wszib.dao;

import pl.edu.wszib.model.Product;

import java.util.List;

public interface IProductDAO {
    void saveProduct(Product product);
    void deleteProduct(Product product);
    List<Product> getAllProducts();
    Product getProduct(int id);
}
