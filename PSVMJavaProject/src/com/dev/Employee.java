package com.dev;

public class Employee {
	int id,age,salary;
	String name,location;
	
	public Employee(int id,int age,int salary,String name, String location)
	{
		this.id=id;
		this.age=age;
		this.salary=salary;
		this.name=name;
		this.location=location;
	}
	
	public void employeeDetails()
	{
		System.out.println(id+"\t"+name+"\t"+age+"\t"+salary+"\t"+location);
	}
}
