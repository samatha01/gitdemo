package com.basics.comparable;

public class Student implements Comparable<Student> {
     private int rollNumber;
     private String name;
     private int age;
  public Student(int rollNumber,String name,int age) {
	  this.rollNumber=rollNumber;
	  this.name=name;
	  this.age=age;
  }
  public void setName(String name) {
	  this.name=name;
  }
  public void setAge(int age) {
	  this.age=age;
  }
  public void setRollNumber(int rollNumber) {
	  this.rollNumber=rollNumber;
  }
  public int getAge() {
	  return age;
  }
  public String getName() {
	  return name;
  }
  public int getRollNumber() {
	  return rollNumber;
  }
  @Override
  public int compareTo(Student student) {            //sorting based on roll number.
	  return this.rollNumber - student.rollNumber;
  }
}
