package com.beyondhackathon.apployalty.repositories;

import java.util.List;
import com.beyondhackathon.apployalty.entities.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OfferRepository extends MongoRepository<Offer, String> {

    @Override
    List<Offer> findAll();

}
