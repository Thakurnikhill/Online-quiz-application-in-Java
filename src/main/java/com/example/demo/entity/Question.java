package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //SEQUENCE also use

    private Integer id;
    private String problem;
    private String solution1;
    private String solution2;
    private String solution3;
    private String solution4;
    private String rightAnswer;
    private String difficultyLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getSolution1() {
        return solution1;
    }

    public void setSolution1(String solution1) {
        this.solution1 = solution1;
    }

    public String getSolution2() {
        return solution2;
    }

    public void setSolution2(String solution2) {
        this.solution2 = solution2;
    }

    public String getSolution3() {
        return solution3;
    }

    public void setSolution3(String solution3) {
        this.solution3 = solution3;
    }

    public String getSolution4() {
        return solution4;
    }

    public void setSolution4(String solution4) {
        this.solution4 = solution4;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
