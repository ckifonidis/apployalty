package com.beyondhackathon.apployalty.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "Discount")
public class Discount {

    @Id
    private String id;
    private Issuer issuer;
	private Offer offertype ;
	private String desc;
	private String betweenLetters;
	private String longDesc;
	private String name;
	private Date timefrom ;
	private Date timeto ;
	private String timeMatch;
	private boolean valid;

}
