package com.beyondhackathon.apployalty.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "shopchain")
public class ShopChain {

    @Id
    private String id;
    private String category;
    private String name;
    private String desc;
    private List<Shop> shops ;
    private boolean isEurobank;
}
