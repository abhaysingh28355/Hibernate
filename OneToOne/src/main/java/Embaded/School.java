package Embaded;

import jakarta.persistence.Embeddable;


@Embeddable
public class School {
	
	
	private String Schoolname;
	private String Schooladdress;
	
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}


	public School(String schoolname, String schooladdress) {
		super();
		Schoolname = schoolname;
		Schooladdress = schooladdress;
	}


	public String getSchoolname() {
		return Schoolname;
	}


	public void setSchoolname(String schoolname) {
		Schoolname = schoolname;
	}


	public String getSchooladdress() {
		return Schooladdress;
	}


	public void setSchooladdress(String schooladdress) {
		Schooladdress = schooladdress;
	}


	@Override
	public String toString() {
		return "School [SchoolName=" + Schoolname + ", SchoolAddress=" + Schooladdress + "]";
	}
	
	

}
