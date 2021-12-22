package com.ProjetJavaPhpV2.ProjetJavaPhpV2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
public class Ordered {

    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDERED_SEQ")
    @SequenceGenerator(name = "ORDERED_SEQ", sequenceName = "ORDERED_SEQ")
    private Integer orderedId;
    private Date orderedDate;
    @OneToMany(mappedBy = "ordered")
    private Collection<OrderedLine> items;
    @ManyToMany
    @JoinColumn(name="customerId")
    private Customer customer;

}
