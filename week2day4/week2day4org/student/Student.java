package week2.week2day4org.student;

import week2.week2day4org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name : Joshvik");
	}
	public void studentDept() {
		System.out.println("Student Department : Aeronautical");
	}
	public void studentId() {
		System.out.println("Student Id : 10");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.collegeName();
		s1.collegeCode();
		s1.collegeRank();
		System.out.println("---------");
		s1.deptName();
		System.out.println("---------");
		s1.studentName();
		s1.studentDept();
		s1.studentId();
	}
}
