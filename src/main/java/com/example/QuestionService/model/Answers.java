package com.example.QuestionService.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "answers")
public class Answers {
    @Id
    public int id;
    public String answer;
    public int isCorrect;
    public String points;
    @ManyToOne
    @JoinColumn(name = "question_id",referencedColumnName="id")
    @JsonIgnore
    public Question question;


}

