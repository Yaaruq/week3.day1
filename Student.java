package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("The Student Name is: Yaaruq");
	}

	public void studentDept() {
		System.out.println("The Department is: MCA");
	}
	public void studentId() {
		System.out.println("The Student ID is: 1001");
	}
	
public static void main(String[] args) {
	College c = new College();
	Department d = new Department();
	Student s = new Student();
	System.out.println("College Methods");
	c.CollegeName();
	c.CollegeCode();
	c.CollegeRank();
	System.out.println("Department Methods");
	d.deptName();
	System.out.println("Student Methods");
	s.studentName();
	s.studentDept();
	s.studentId();
	
}
}
