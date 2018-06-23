package com.beyondhackathon.apployalty.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "shop")
public class Shop {

    @Id
    private String id;
	private double latitude;
	private double longtitude;
	private String address;
	private String descr;

}
