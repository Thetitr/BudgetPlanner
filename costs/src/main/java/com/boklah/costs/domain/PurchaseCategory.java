package com.boklah.costs.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 *
 */
@Data
@Document
public class PurchaseCategory {

    @Id
    private String id;

    private String name;

    private List<PurchaseSubCategory> subCategories;


}
