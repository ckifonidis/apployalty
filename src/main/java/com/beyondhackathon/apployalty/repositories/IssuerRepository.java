package com.beyondhackathon.apployalty.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beyondhackathon.apployalty.entities.Issuer;
import com.beyondhackathon.apployalty.entities.ShopChain;

public interface IssuerRepository extends MongoRepository<Issuer, String> {

    @Override
    List<Issuer> findAll();


}
