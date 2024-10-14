package com.dev;

public class Student {
	int studentId;
	String studentName;
	long studentPhone;
	
	public Student(int studentId,String studentName, long studentPhone)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentPhone=studentPhone;
	}
	
	public void getStudentDetails()
	{
		System.out.println(studentId+"\t"+studentName+"\t"+studentPhone);
	}
}
