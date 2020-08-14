package com.ropafadzom.examapp.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Basic(optional = false)s
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    	
    private String studentNumber;
    
    private String firstName;

    private String lastName;
    
    private String username;

    private String password;

    @Transient
    private String passwordConfirm;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "record_id",referencedColumnName = "id")
     private Record record;

    @ManyToMany
    private Set<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstNme(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastNme(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return username;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this. studentNumber= studentNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
   
    public Record getRecord() {
        return record;
    }
    public void setRecord (Record record) {
        this.record = record;
    }
   
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
