package com.dover.javatest;

import java.util.*;

public class StudentServiceImpl implements StudentService {
	
	private final Map<String, Student> studentMap = new HashMap<>();

	@Override
	public void addStudent(Student student) {
		if(studentMap.containsKey(student.getId())) {
			System.out.println("Student with ID " + student.getId() + " already exists.");
			return;
		}
		studentMap.put(student.getId(), student);
		System.out.println("Student added: " + student.getName());
	}

	@Override
	public List<Student> getAllStudents() {
		return new ArrayList<>(studentMap.values());
	}

	@Override
	public Student getStudentById(String id) {
		return studentMap.get(id);
	}

	@Override
	public void updateStudent(String id, Student updatedStudent) {
		if(!studentMap.containsKey(id)) {
			System.out.println("Student ID "+id+" not found.");
			return;
		}
		studentMap.put(id, updatedStudent);
		System.out.println("Student updated: " +updatedStudent.getName());
		
	}

	@Override
	public void deleteStudent(String id) {
		if(studentMap.remove(id) != null) {
			System.out.println("\nStudent removed with Id: " + id);
		}
		else {
			System.out.println("Student ID "+id+" not found.");
		}
	}
}
