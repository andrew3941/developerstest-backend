package com.developtester.developers.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "FIRST_NAME", length = 128, nullable = false)
    private String firstName;
    @Basic
    @Column(name = "LAST_NAME", length = 128, nullable = false)
    private String lastName;
    @Basic
    @Column(name = "EMAIL", length = 128, nullable = false)
    private String email;
    @Basic
    @Column(name = "PROGRAMMING_LANGUAGE", length = 128, nullable = false)
    private String programmingLanguage;
}
