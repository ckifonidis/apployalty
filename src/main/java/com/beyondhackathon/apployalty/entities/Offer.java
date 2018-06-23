package com.beyondhackathon.apployalty.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "offer")
public class Offer {

    @Id
    private String id;
    private String issuer;
    private OfferType offerType;
}
