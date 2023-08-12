package com.springboot.studentProject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.studentProject.model.Student;
import com.springboot.studentProject.service.StudentService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	public StudentService studentService;

	@PostMapping("/create") // req mapping in method level 
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		System.out.println("--------------------------------------------------------------------------------------------");
		 System.out.println("Creating Student "+ student.getName() );
	     System.out.println(student);
	     studentService.saveStudent(student);
	     return new ResponseEntity<Student>(student, HttpStatus.CREATED);
	}
	 
	 @RequestMapping(value={"/get","/getStudent"} , headers="Accept=application/json" , method = RequestMethod.GET) // with multiple URI & HTTP req
	 public ResponseEntity<List<Student>> getAllStudents(){
		 List<Student> studList = studentService.getStudentList();
		 System.out.println(studList);
		 return new ResponseEntity<List<Student>> (studList,HttpStatus.OK);
	 }
	
	 @GetMapping(value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Student> getStudentById(@PathVariable("id") String Id) {
	        System.out.println("Fetching Student with id " + Id);
	        Student stud = studentService.findStudentById(Id);
	        if (stud == null) {
	            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<Student>(stud, HttpStatus.OK);
	    }
	 @PutMapping(value="/update/{id}", headers="Accept=application/json")
		public ResponseEntity<Student> updateStudentById(@PathVariable("id")String Id, @RequestBody Student currentStud)
		{
		Student stud = studentService.findStudentById(Id); // connects to jpa via service
		System.out.println(stud.getName() + " -------------------------------------------------------------------------------------");
		System.out.println(currentStud.getName() + " -------------------------------------------------------------------------------------");
		if (stud==null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		
		stud.setName(currentStud.getName());
		stud.setEmail(currentStud.getEmail());
		stud.setMobile(currentStud.getMobile());
		stud.setAltMobile(currentStud.getAltMobile());
		stud.setGender(currentStud.getGender());
		stud.setDob(currentStud.getDob());
		stud.setHighestDegree(currentStud.getHighestDegree());
		stud.setYearOfPassOut(currentStud.getYearOfPassOut());
		stud.setCgpa(currentStud.getCgpa());
		stud.setHighSchool(currentStud.getHighSchool());
		stud.setHigherSec(currentStud.getHigherSec());
		stud.setAddressLine1(currentStud.getAddressLine1());
		stud.setAddressLine2(currentStud.getAddressLine2());
		stud.setCity(currentStud.getCity());
		stud.setState(currentStud.getState());
		stud.setPincode(currentStud.getPincode());
		stud.setCourseName(currentStud.getCourseName());
		stud.setFeeStructure(currentStud.getFeeStructure());
		stud.setReference(currentStud.getReference());
		stud.setNotes(currentStud.getNotes()); 
		
	studentService.updateStudent(stud, stud.getId());
		return new ResponseEntity<Student>(stud,HttpStatus.OK);
		}
	
	 @DeleteMapping(value="/deleteById/{id}", headers ="Accept=application/json")
		public String deleteStudent(@PathVariable("id") String id){
			Student student = studentService.findStudentById(id);
			if (student == null) {
				return "no user found";
			}
			studentService.deleteStudentById(id);
			return "user deleted successfully";

	 }
}
