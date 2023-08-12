package com.springboot.studentProject.service;

import java.util.List;

import com.springboot.studentProject.model.Student;


public interface StudentService {
	
	public void saveStudent(Student student);
	public List<Student> getStudentList();
	public Student findStudentById(String Id);
	public Student updateStudent(Student student, String Id);
	public void deleteStudentById(String Id);
	
}	
