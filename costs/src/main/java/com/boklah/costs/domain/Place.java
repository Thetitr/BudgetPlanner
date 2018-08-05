package com.boklah.costs.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 */
@Data
@Document
public class Place {

    @Id
    private String id;

    private String name;

    private Location location;
}
