package com.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("target")
@Scope("prototype")
public class Student {
	@Value("amand")
	private String studentName;
	@Value("mysore")
	private String studentCity;
	@Value("#{w}")
	private List<String> address;
	public String getStudentName() {
		return studentName;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	/*
	 * @Override public String toString() { return "Student [studentName=" +
	 * studentName + ", studentCity=" + studentCity + "]"; }
	 */
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + ", address=" + address + "]";
	}

}
