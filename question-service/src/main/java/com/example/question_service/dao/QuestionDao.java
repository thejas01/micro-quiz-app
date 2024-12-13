package com.example.question_service.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.question_service.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

  
}