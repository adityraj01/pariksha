package com.example.demo.service;

import java.util.Set;

import com.example.demo.model.exam.Question;
import com.example.demo.model.exam.Quiz;

public interface QuestionService {
	public Question addQuestion(Question question);
	public Question updateQuestion(Question question);
	public Set<Question> getQuestions();
	public Question getQuestion(Long questionId);
	public Set<Question> getQuestionsOfQuiz(Quiz quiz);
	public void deleteQuestion(Long quesId);
}
