package com.exam01;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	String dept;
	int studentID;
	double avg;
	
	public Student(String name, String dept, int studentID, double avg) {
		this.name=name;
		this.dept=dept;
		this.studentID=studentID;
		this.avg=avg;
	}
	
	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getStudentID() {
		return studentID;
	}

	public double getAvg() {
		return avg;
	}
}