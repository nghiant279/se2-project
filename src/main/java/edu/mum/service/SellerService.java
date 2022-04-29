package edu.mum.service;

import edu.mum.model.Buyer;
import edu.mum.model.Seller;
import edu.mum.model.User;

import java.util.List;

public interface SellerService {
    Seller getSellerById(Long id);
    Seller save(Seller seller);
    Seller getSellerByUser(User user);
    List<Buyer> getFollowers(Long sellerId);
    Seller updateSeller(Seller seller);
    List<Seller> getAllSellers();
}
