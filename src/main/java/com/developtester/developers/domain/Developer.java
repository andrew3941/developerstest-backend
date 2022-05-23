package com.developtester.developers.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Developer implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String programmingLanguage;

    public Developer() {
    }

    public Developer(int id, String firstName, String lastName, String email, String programmingLanguage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.programmingLanguage = programmingLanguage;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable = false)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Basic
    @Column(name="FIRST_NAME", length = 128, nullable = false)
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    @Basic
    @Column(name="LAST_NAME", length = 128, nullable = false)
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    @Basic
    @Column(name="EMAIL", length = 128, nullable = false)
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    @Basic
    @Column(name="PROGRAMMING_LANGUAGE", length = 128, nullable = false)
    public String getProgrammingLanguage() {return programmingLanguage;}
    public void setProgrammingLanguage(String programmingLangure) {this.programmingLanguage = programmingLangure;}
}
