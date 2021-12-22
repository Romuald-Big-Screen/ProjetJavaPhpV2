package com.ProjetJavaPhpV2.ProjetJavaPhpV2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Role {

    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLE_SEQ")
    @SequenceGenerator(name = "ROLE_SEQ", sequenceName = "ROLE_SEQ")
    private Integer roleId;
    @ManyToMany
    private String roleName;

}
