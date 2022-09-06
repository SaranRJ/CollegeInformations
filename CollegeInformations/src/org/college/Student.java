package org.college;

public class Student extends college{

	public void studentName() {
		System.out.println("Student Name: Saran");
	}

	public void studentDept() {
		System.out.println("Student Dept: Mech");

	}

	public void studentId() {
		System.out.println("Student ID :120");
	}
	
public static void main(String[] args) {
	
	Student s = new Student();
	s.studentName();
	s.studentId();
	s.studentDept();
	s.collegeName();
	s.collegeRank();
	s.collegeCode();
	s.deptName();
	s.hostelName();
	
}	
}
