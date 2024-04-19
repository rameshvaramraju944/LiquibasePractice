package com.dblearning.liquibase.entities;

import jakarta.persistence.*;

import java.util.Date;

@Table(name="user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="email")
    private String email;
    @Column(name ="password")
    private String password;

    @Column(name ="createdAt")
    private Date createdAt;
}
