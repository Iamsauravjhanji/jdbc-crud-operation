package com.jsp.student_crud_with_prepared.dto;

public class Student {


	private int studentId;
	private String Studentname;
	private String StudentEmail;
	private long studentPhone;
	public Student() {
		super();
	}
	public Student(int studentId, String studentname, String studentEmail, long studentPhone) {
		super();
		this.studentId = studentId;
		Studentname = studentname;
		StudentEmail = studentEmail;
		this.studentPhone = studentPhone;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}
	public long getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}
}
