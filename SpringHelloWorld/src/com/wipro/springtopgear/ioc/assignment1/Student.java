package com.wipro.springtopgear.ioc.assignment1;

public class Student {
	private String studentId;
	private String studentName;
	private Test studentTest;

	public Student(Test studentTest) {
		this.studentTest=studentTest;
	} 
	
	public Student() {
		System.out.println("INSIDE STUDENT DEFAULT CONSTRUCTOR");
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

	public String getStudentTest() {
		return "Test id: "+studentTest.getTestId()+" Name: "+studentTest.getTestTitle()+" Marks: "+studentTest.getTestMarks();
	}
	
	public String toString() {
		return "Student id: "+getStudentId()+" Name: "+getStudentName()+" "+getStudentTest();
	}
}
