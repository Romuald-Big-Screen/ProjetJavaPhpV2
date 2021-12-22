package com.ProjetJavaPhpV2.ProjetJavaPhpV2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity

public class Customer {

    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_SEQ")
    @SequenceGenerator(name = "CUSTOMER_SEQ", sequenceName = "CUSTOMER_SEQ")
    private Integer customerId;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String phone;
    @OneToMany(mappedBy = "customer")
    private Collection<Ordered> ordereds;

}
