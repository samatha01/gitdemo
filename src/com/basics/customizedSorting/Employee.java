package com.basics.customizedSorting;

public class Employee {
private int emp_id;
private int age;
private String emp_name;
private  Address address;
public Employee(int emp_id, int age, String emp_name, Address address) {
	super();
	this.emp_id = emp_id;
	this.age = age;
	this.emp_name = emp_name;
	this.address = address;
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", age=" + age + ", emp_name=" + emp_name + ", address=" + address + "]";
}

}
