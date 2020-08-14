package com.ropafadzom.examapp.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "soution_id",referencedColumnName = "id")
    private Solution answer;

    @ManyToMany
    private Set<Solution> solutions;
    
    @ManyToMany
    private Set<Record> records;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Solution getAnswer() {
        return answer;
    }

    public void setAnswer(Solution answer) {
        this.answer = answer;
    }


    public Set<Solution> getSolutions() {
        return solutions;
    }

    public void setSolutions(Set<Solution> solutions) {
        this.solutions = solutions;
    }
    public Set<Record> getRecords() {
        return records;
    }

    public void setRecords(Set<Record> records) {
        this.records = records;
    }
}
