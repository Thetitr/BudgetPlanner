package com.boklah.costs.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 */
@Data
@Document
public class Location {

    @Id
    private String id;

    private String country;

    private String city;

    private String street;

    private String streetType;

    private String houseNumber;
}
