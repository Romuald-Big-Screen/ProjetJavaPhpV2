package com.ProjetJavaPhpV2.ProjetJavaPhpV2.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Book {
    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_SEQ")
    @SequenceGenerator(name = "PRODUCT_SEQ", sequenceName = "PRODUCT_SEQ")
    private Integer productId;
    @NotBlank(message = "title is mandatory")
    private String title;
    @NotBlank(message = "Publishing house is mandatory")
    private String publishingHouse;
    @Lob
    private byte[] image;
    private String nomImage;
    @NotBlank(message = "Property is mandatory")
    private String property;
    @NotBlank(message = "Price is mandatory")
    private double price;
    private boolean selected;
    private int quantity;

}
