package com.dev;

public class MethodOverloading {
	public int add(int x,int y)
	{
		return x+y;
	}
	public double add(int x, double y)
	{
		return x+y;
	}
	public String add(String x, double y)
	{
		return x+y;
	}
	public String add(String x, String y)
	{
		return x+y;
	}
	public static void func()
	{
		System.out.println("Inside func()");
	}
	public static void func(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		MethodOverloading mo=new MethodOverloading();
		int sum=mo.add(5, 3);
		System.out.println(sum);
		MethodOverloading.func();
		MethodOverloading.func(5);
		
	}
}
