package com.ropafadzom.examapp.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "record")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long score;
    
    @OneToOne(mappedBy = "record")
     private User student;
 
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    
    @ManyToMany(mappedBy = "records")
    private Set<Question> question;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

  

    public Set<Question> getQuestions() {
        return question;
    }

    public void setQuestions(Set<Question> question) {
        this.question = question;
    }
}

