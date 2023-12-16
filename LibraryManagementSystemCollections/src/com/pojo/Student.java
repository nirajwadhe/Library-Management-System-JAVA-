package com.pojo;

public class Student {
	int studentid;
	String studentname, studentemail, studentcontact, studentdeptartment;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentemail() {
		return studentemail;
	}

	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}

	public String getStudentcontact() {
		return studentcontact;
	}

	public void setStudentcontact(String studentcontact) {
		this.studentcontact = studentcontact;
	}

	public String getStudentdeptartment() {
		return studentdeptartment;
	}

	public void setStudentdeptartment(String studentdeptartment) {
		this.studentdeptartment = studentdeptartment;
	}

	public String toString() {

		return "Student ID : " + getStudentid() + ",  Name : " + getStudentname() + ",  Department : "
				+ getStudentdeptartment() + "\nE-Mail : " + getStudentemail() + ",  Contact : " + getStudentcontact();
	}

}
