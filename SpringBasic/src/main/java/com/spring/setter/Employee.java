package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
private String employeeName;
private int employeeId;
private Address address;

public Address getAddress() {
	return address;
}
@Autowired
public void setAddress(Address address) {
	this.address = address;
}
public Employee() {
	super();
}
public Employee(String employeeName, int employeeId) {
	super();
	this.employeeName = employeeName;
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
@Value("Puneeth")
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getEmployeeId() {
	return employeeId;
}
@Value("101")
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
@Override
public String toString() {
	return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", address=" + address + "]";
}

}
