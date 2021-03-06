package edu.mum.repository;

import edu.mum.model.Category;
import edu.mum.model.Product;
import edu.mum.model.Seller;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findProductsByCategory(Category category);

    List<Product> findProductsBySeller(Seller seller);

    @Query("SELECT p FROM Product p WHERE p.name LIKE ?1 ")
    List<Product> findProductsByName(String name);
}
