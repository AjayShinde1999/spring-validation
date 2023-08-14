package com.springvalidation.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String city;
    private String email;
    private String mobile;

}
