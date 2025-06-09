package com.dover.javatest;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentServiceImpl();
		
		//Creating students
		Student s1 = new Student("S001", "John", 18, "12", "john@gmail.com");
		Student s2 = new Student("S002", "Alex", 17, "11", "alex@gmail.com");
		
		//Add students
		studentService.addStudent(s1);
		studentService.addStudent(s2);
		
		//Display All Students
		System.out.println("\nStudents:-");
		List<Student> students = studentService.getAllStudents();
		for(Student s :students) {
			System.out.println(s);
		}
		
		//Get Student By ID
		System.out.println("\nStudent with ID S001");
		Student fetched1 = studentService.getStudentById("S001");
		System.out.println(fetched1 != null ? fetched1 : "Student not found");
		System.out.println("Student with ID S003");
		Student fetched2 = studentService.getStudentById("S003");
		System.out.println(fetched2 != null ? fetched2 : "Student not found");
		
		//Update Student
		Student updateds1 = new Student("S001", "Alice", 19, "12", "alice@gmail.com");
		studentService.updateStudent("S001", updateds1);
		System.out.println("\nUpdated student with ID S001");
		System.out.println(studentService.getStudentById("S001"));
		
		//Delete Student
		studentService.deleteStudent("S002");
		System.out.println("\nStudents:-");
		for(Student s :studentService.getAllStudents()) {
			System.out.println(s);
		}
	}
}
