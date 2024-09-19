package com.example.demo.service;

import com.example.demo.dto.QuestionDto;
import com.example.demo.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDto questionDto;

    public List<Question> getAllQuestions() {

        return questionDto.findAll();
    }

    public List<Question> getQuestionsByDifficultyLevel(String difficultyLevel) {
        return questionDto.findByDifficultyLevel(difficultyLevel);
    }

    public String addQuestion(Question question) {
        questionDto.save(question);
        return "success";
    }

    public String deleteQuestionById(Integer id) {
        questionDto.deleteById(id);
        return "Deleted";
    }
}
