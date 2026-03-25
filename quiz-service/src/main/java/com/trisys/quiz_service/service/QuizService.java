package com.trisys.quiz_service.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.trisys.quiz_service.model.QuestionWrapper;
import com.trisys.quiz_service.model.Response;

public interface QuizService {
    public ResponseEntity<String> createQuiz(String category, int numQ, String title);
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) ;
    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses);
}