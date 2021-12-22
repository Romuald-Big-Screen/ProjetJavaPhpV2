package com.ProjetJavaPhpV2.ProjetJavaPhpV2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDUSER_SEQ")
    @SequenceGenerator(name = "IDUSER_SEQ", sequenceName = "IDUSER_SEQ")
    @Column(name = "user_id")
    private Integer idUser;
    @Column(name = "userName")
    private String userName;
    private String password;
    private boolean actived;
    @OneToMany
    @JoinColumn(name = "User_id")
    private Collection<Role> roles;

}
