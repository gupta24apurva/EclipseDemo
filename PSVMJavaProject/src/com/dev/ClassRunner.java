package com.dev;
import java.util.Scanner;

public class ClassRunner {
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		Employee[] arr=new Employee[5];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter details: ");
			int id=Integer.parseInt(obj.nextLine());
			int age=Integer.parseInt(obj.nextLine());
			int salary=Integer.parseInt(obj.nextLine());
			String name=obj.nextLine();
			String location=obj.nextLine();
			arr[i]=new Employee(id,age,salary,name,location);
		}
		
		System.out.println("Employee details: ");
		for(int i=0;i<3;i++)
		{
			arr[i].employeeDetails();
		}
		obj.close();
	}
}
