package com.ManyToMany;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "project_R")
public class Project {

	@Id
	private int Pid;
	private String ProjectName;
	@ManyToMany
	private List<Emp> Emps;

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public List<Emp> getEmps() {
		return Emps;
	}

	public void setEmps(List<Emp> emps) {
		Emps = emps;
	}

	public Project(int pid, String projectName, List<Emp> emps) {
		super();
		Pid = pid;
		ProjectName = projectName;
		Emps = emps;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
}
