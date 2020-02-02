package pl.edu.wszib.services;

import pl.edu.wszib.model.Product;

import java.util.List;

public interface IProductService {
    void saveProduct(Product product);
    void deleteProduct(Product product);
    List<Product> getAllProducts();
    Product getProduct(int id);
}
