package edu.mum.service;

import edu.mum.model.Category;
import edu.mum.model.Product;
import edu.mum.model.Seller;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Product findById(Long id);

    Product save(Product product);

    void delete(Product product);

    List<Product> getProductsByCategory(Category category);

    List<Product> getProductsBySeller(Seller seller);

    List<Product> getProductsByName(String name);
}
