package com.example.demo.dto;

import com.example.demo.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDto extends JpaRepository<Question,Integer> {
    List<Question> findByDifficultyLevel(String difficultyLevel);


}
