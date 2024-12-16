package com.example.question_service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.question_service.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

  @Query("SELECT q FROM Question q WHERE q.category = :category ORDER BY FUNCTION('RAND') LIMIT :count")
List<Question> findRandomQuestionsByCategory(@Param("category") String category, @Param("count") int count);

}