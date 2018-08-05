package com.boklah.costs.domain;

import lombok.Data;
import org.javamoney.moneta.Money;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * Purchase mongo db representation.
 */
@Data
@Document
public class Purchase {

    @Id
    private String id;

    private Money amount;

    private PurchaseSubCategory category;

    private Place place;

    private LocalDateTime dateTime;

    private String description;
}
