package com.maping.Maping;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer_Q")
public class Answer{

	@Id
	
	private int id;
	private String answer;
	
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Answer(int answerid, String answer) {
		super();
		this.id = answerid;
		this.answer = answer;
	}


	public int getAnswerid() {
		return id;
	}


	public void setAnswerid(int answerid) {
		this.id = answerid;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
