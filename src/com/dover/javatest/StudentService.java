package com.dover.javatest;

import java.util.List;

public interface StudentService{
	void addStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentById(String id);
	void updateStudent(String id, Student updatedStudent);
	void deleteStudent(String id);
}