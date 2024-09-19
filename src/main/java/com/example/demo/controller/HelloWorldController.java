package com.example.demo.controller;

import com.example.demo.entity.Question;
//import com.example.demo.repository.StudentRepository;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/new")
public class HelloWorldController {



    @Autowired
    QuestionService questionService;


    @GetMapping(path = "AllQuestion")
    public List<Question> getAllQuestions(){
    return questionService.getAllQuestions();

    }


    @GetMapping(path = "difficultyLevel/{difficultyLevel}")  //when we fetch data from the server we normally use @GetMapping
    public List<Question> getQuestionsByDifficultyLevel(@PathVariable String difficultyLevel){
        return questionService.getQuestionsByDifficultyLevel(difficultyLevel);
    }


    @PostMapping(path = "Add")      // send data to the sever we normally use @PostMapping
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @DeleteMapping("deleteQuestion/{id}")
    public String deleteQuestionById(@PathVariable("id") Integer id) {
        return questionService.deleteQuestionById(id);
    }

}
