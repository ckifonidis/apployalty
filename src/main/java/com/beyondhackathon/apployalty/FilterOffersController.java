package com.beyondhackathon.apployalty;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class FilterOffersController {

    @PostMapping(path = "/filter-offers")
    ResponseEntity filterOffers() {
        List<Map<String, String>> filterResults = new ArrayList<>();
        Map<String, String> singleResult = new HashMap<>();
        singleResult.put("business", "Kotsovolos");
        singleResult.put("category", "Shopping");
        singleResult.put("offer", "50% off");
        singleResult.put("product", "Washing machines");
        singleResult.put("productCategory", "Oikiakes syskeues");
        filterResults.add(singleResult);
        return ResponseEntity.ok(filterResults);
    }
}
