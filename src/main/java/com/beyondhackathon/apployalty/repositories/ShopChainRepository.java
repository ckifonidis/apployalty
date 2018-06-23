package com.beyondhackathon.apployalty.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beyondhackathon.apployalty.entities.ShopChain;

public interface ShopChainRepository extends MongoRepository<ShopChain, String> {

    @Override
    List<ShopChain> findAll();


}
