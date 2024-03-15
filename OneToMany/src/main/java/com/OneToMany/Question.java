package com.OneToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Question_Id")
public class Question {

	@Id
	private int questionid;
	private String question;
	
	@OneToMany
	private List<Answer>answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionid, String question, List<Answer> answer) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.answer = answer;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	
}
