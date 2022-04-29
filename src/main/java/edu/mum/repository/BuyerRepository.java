package edu.mum.repository;

import edu.mum.model.Buyer;
import edu.mum.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends CrudRepository<Buyer, Long> {
    Buyer findBuyerByUser(User user);

}
