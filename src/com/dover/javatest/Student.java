package com.dover.javatest;

import java.util.Objects;

public class Student {
	private String id;
	private String name;
	private int age;
	private String grade;
	private String email;
	
	public Student(String id, String name, int age, String grade, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Student)) return false;
		Student student = (Student) o;
		return Objects.equals(id, student.id);
	}
	
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public String toString() {
		return "Student ID: " + id +
			   ", Name: " + name +
			   ", Age: " + age +
			   ", Grade: " + grade +
			   ", Email: " + email;
	}
}
