package com.example.QuestionService.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "question")
public class Question {
    @Id
    public int id;
    public String question;
    public String points;
    public String topic;
    @OneToMany(mappedBy = "question",cascade=CascadeType.ALL)
    public List<Answers> answers;
}
