package com.maping.Maping;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "question_data")
public class question{
	
	@Id
	
	private int id;
	private String question;
	
	@OneToOne
	private Answer answer;

	public question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public question(int questionid, String question, Answer answer) {
		super();
		this.id = questionid;
		this.question = question;
		this.answer = answer;
	}

	public int getQuestionid() {
		return id;
	}

	public void setQuestionid(int questionid) {
		this.id = questionid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	
}
