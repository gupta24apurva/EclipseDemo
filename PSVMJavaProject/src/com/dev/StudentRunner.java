package com.dev;
import java.util.Scanner;

public class StudentRunner {
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		Student[] arr=new Student[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter details: ");
			int id=Integer.parseInt(obj.nextLine());
			String name=obj.nextLine();
			long phone=Long.parseLong(obj.nextLine());
			arr[i]=new Student(id,name,phone);
		}
		
		System.out.println("Student details: ");
		for(int i=0;i<5;i++)
		{
			arr[i].getStudentDetails();
		}
		obj.close();
	}
}
