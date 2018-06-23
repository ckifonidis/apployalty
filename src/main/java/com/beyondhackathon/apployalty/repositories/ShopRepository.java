package com.beyondhackathon.apployalty.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beyondhackathon.apployalty.entities.Shop;

public interface ShopRepository extends MongoRepository<Shop, String> {

    @Override
    List<Shop> findAll();


}
