package com.amit.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity // this specify the class as jpa entity
@Table(name="employees") //this specify the table name
public class Employee {

    @Id // this specify the column as Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this autoincrements the PK
    private Long id;

    @Column(name="firstName")//this explicitly set column name
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="email_ID", nullable=false, unique = true)
    private String email;
}
