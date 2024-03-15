package com.OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Answer_Id")
public class Answer {

	@Id
	private int Answerid;
	private String Answer;
	
	@ManyToOne
	private Question question;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int answerid, String answer, Question question) {
		super();
		Answerid = answerid;
		Answer = answer;
		this.question = question;
	}

	public int getAnswerid() {
		return Answerid;
	}

	public void setAnswerid(int answerid) {
		Answerid = answerid;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
