package com.blog.blogspring.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private int id;
    private String name;
    private String username;
    private String password;
    private String fatherName;
    private String motherName;

    @ManyToOne
    private Role role;


   public User() {

    }

   public User(int id, String name, String username, String password, String fatherName, String motherName, int roleId) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.role = new Role(roleId, "");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
