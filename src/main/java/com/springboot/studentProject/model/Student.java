package com.springboot.studentProject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {
	


	@Id
	private String id;
	private String name;
	private String email;
	private long mobile;
	private long altMobile;
	private String gender;
	private long dob;
	private String highestDegree;
	private long yearOfPassOut;
	private double cgpa;
	private double highSchool;
	private double higherSec;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private long pincode;
	private String courseName;
	private long feeStructure;
	private String reference;
	private String notes;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getAltMobile() {
		return altMobile;
	}
	public void setAltMobile(long altMobile) {
		this.altMobile = altMobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getDob() {
		return dob;
	}
	public void setDob(long dob) {
		this.dob = dob;
	}
	public String getHighestDegree() {
		return highestDegree;
	}
	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}
	public long getYearOfPassOut() {
		return yearOfPassOut;
	}
	public void setYearOfPassOut(long yearOfPassOut) {
		this.yearOfPassOut = yearOfPassOut;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public double getHighSchool() {
		return highSchool;
	}
	public void setHighSchool(double highSchool) {
		this.highSchool = highSchool;
	}
	public double getHigherSec() {
		return higherSec;
	}
	public void setHigherSec(double higherSec) {
		this.higherSec = higherSec;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public long getFeeStructure() {
		return feeStructure;
	}
	public void setFeeStructure(long feeStructure) {
		this.feeStructure = feeStructure;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	public Student() {
		
	}
	
	public Student(String name, String email, long mobile, long altMobile, String gender, long dob,
			String highestDegree, long yearOfPassOut, double cgpa, double highSchool, double higherSec,
			String addressLine1, String addressLine2, String city, String state, long pincode, String courseName,
			long feeStructure, String reference, String notes) {
	
	
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.altMobile = altMobile;
		this.gender = gender;
		this.dob = dob;
		this.highestDegree = highestDegree;
		this.yearOfPassOut = yearOfPassOut;
		this.cgpa = cgpa;
		this.highSchool = highSchool;
		this.higherSec = higherSec;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.courseName = courseName;
		this.feeStructure = feeStructure;
		this.reference = reference;
		this.notes = notes;
	}
	
	

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", altMobile="
				+ altMobile + ", gender=" + gender + ", dob=" + dob + ", highestDegree=" + highestDegree
				+ ", yearOfPassOut=" + yearOfPassOut + ", cgpa=" + cgpa + ", highSchool=" + highSchool + ", higherSec="
				+ higherSec + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + ", courseName=" + courseName + ", feeStructure="
				+ feeStructure + ", reference=" + reference + ", notes=" + notes + "]";
	}
}
