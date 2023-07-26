package com.example.Backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
// entity is used to sync java with table database somehow
// this is coming from jpa dependency

public class User {
    @Id
//    This is another JPA annotation used to designate the primary key of the entity.
//    In this case, we are using an automatically generated primary key,

    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    This annotation specifies the strategy for generating the primary key values
//    IDENTITY strategy, which means the primary key values will be automatically generated

    private Long id;
    private String name;
    private String email;

    // Getters and setters
    // Constructors
    // Other methods
}
