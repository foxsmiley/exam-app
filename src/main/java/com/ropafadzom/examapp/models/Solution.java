package com.ropafadzom.examapp.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "solution")
public class Solution {
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "solutions")
    private Set<Question> question;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String name) {
        this.description = name;
    }

    public Set<Question> getQuestions() {
        return question;
    }

    public void setQuestions(Set<Question> questions) {
        this.question = questions;
    }
}
