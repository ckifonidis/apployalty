package com.beyondhackathon.apployalty.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "issuer")
public class Issuer {

    @Id
    private String id;
	private String category;
	private String name;
	private String desc;
}
