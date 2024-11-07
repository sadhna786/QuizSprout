package com.quizapp.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizapp.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz , Integer>{

}
