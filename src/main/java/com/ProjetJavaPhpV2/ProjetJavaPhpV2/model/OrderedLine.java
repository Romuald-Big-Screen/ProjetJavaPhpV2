package com.ProjetJavaPhpV2.ProjetJavaPhpV2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class OrderedLine {


    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    @SequenceGenerator(name = "ID_SEQ", sequenceName = "ID_SEQ")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "book_product_id")
    private Book book;
    private int quantity;
    private double price;
    @ManyToOne
    @JoinColumn(name = "ordered_ordered_id")
    private Ordered ordered;
}
