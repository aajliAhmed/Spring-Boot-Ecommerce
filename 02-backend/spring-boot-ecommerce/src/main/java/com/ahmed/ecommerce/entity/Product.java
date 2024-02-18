package com.ahmed.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Product")
@Data
public class Product {
    private Long id;
    private String sku;
    private  String name;
    private String description;
    private BigDecimal unitPrice;
    private String imageURL;
    private boolean active;
    private int unitsInStock;
    private Date dateCreated;
    private  Date lastUpdated;


}
