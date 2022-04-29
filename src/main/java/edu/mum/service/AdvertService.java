package edu.mum.service;


import edu.mum.model.Advert;

import java.util.List;

public interface AdvertService {

    List<Advert> getAll();

    public Advert saveAdvert(Advert advert);

    public List<Advert> getAdverts();

    public Advert getAdvertById(Long id);

    public void deleteAdvert(Advert advert);

}
