package Embaded;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Record")
public class Student {
	
	@Id
	private int id;
	private String name;
	private int rollno;
	@Embedded
	private School school;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int rollno, School school) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		 return "Student [Id=" + id + ", Name=" + name + ", Rollno=" + rollno + ", School=" + school + "]";
	}
	
	

}
