package com.beyondhackathon.apployalty.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beyondhackathon.apployalty.entities.Discount;

public interface OfferRepository extends MongoRepository<Discount, String> {

    @Override
    List<Discount> findAll();

}
