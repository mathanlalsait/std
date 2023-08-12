package com.springboot.studentProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.studentProject.model.Student;
import com.springboot.studentProject.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentRepository studentRepository;
	
	
	public void saveStudent(Student student){
		studentRepository.save(student);
	}
	
	public List<Student> getStudentList(){
	return (List<Student>) studentRepository.findAll();
	}
	
	public Student findStudentById(String Id) {
		return studentRepository.findById(Id).get();
	}
	
	public Student updateStudent(Student student, String Id) {
		return studentRepository.save(student);
	}
	
	public void deleteStudentById(String Id) {
		studentRepository.deleteById(Id);
	}
}
