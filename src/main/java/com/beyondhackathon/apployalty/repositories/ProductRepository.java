package com.beyondhackathon.apployalty.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beyondhackathon.apployalty.entities.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Override
    List<Product> findAll();


}
