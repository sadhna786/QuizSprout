package com.quizapp.quizapp.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quizapp.quizapp.dao.QuestionDao;
import com.quizapp.quizapp.model.Question;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Question>> getAllQuestions(){
        try{
        return new ResponseEntity<>(questionDao.findAll() , HttpStatus.OK);
    }catch(Exception e){
         e.printStackTrace();
    }
    return new ResponseEntity<>(new ArrayList<>() , HttpStatus.BAD_REQUEST);
}

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        return new ResponseEntity<>(questionDao.findByCategory(category) , HttpStatus.OK);
    }

    public ResponseEntity<String> addQuestion(Question question) {
      questionDao.save(question);
      return new ResponseEntity<>("Success" , HttpStatus.CREATED);
    }

    public ResponseEntity<String> updateQuestion(Integer id , Question updatedQuestion) {
        if (questionDao.existsById(id)) {
            updatedQuestion.setId(id);
            questionDao.save(updatedQuestion);
            return new ResponseEntity<>("Question updated successfully!" , HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Question not found!" , HttpStatus.NOT_FOUND);
        }
}

public ResponseEntity<String> deleteQuestion(Integer id) {
    if (questionDao.existsById(id)) {
        questionDao.deleteById(id);
        return new ResponseEntity<>("Question deleted successfully!" , HttpStatus.OK);
    } else {
        return new ResponseEntity<>("Question not found!" , HttpStatus.NOT_FOUND);
    }
}
}
