package com.trisys.question_service.service;


import com.trisys.question_service.dao.QuestionDao;
import com.trisys.question_service.model.Question;
import com.trisys.question_service.model.QuestionWrapper;
import com.trisys.question_service.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;


public interface QuestionService {


    public ResponseEntity<List<Question>> getAllQuestions();
    public ResponseEntity<List<Question>> getQuestionsByCategory(String category);
    public ResponseEntity<String> addQuestion(Question question);
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions);
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds);
    public ResponseEntity<Integer> getScore(List<Response> responses);




}
