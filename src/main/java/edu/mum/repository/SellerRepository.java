package edu.mum.repository;

import edu.mum.model.Seller;
import edu.mum.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Long> {
    Seller findSellerByUser(User user);
}
