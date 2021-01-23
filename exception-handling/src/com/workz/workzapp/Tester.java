package com.workz.workzapp;


public class Tester {
	
	
	public static void main(String[] args)  {
	//	NoClassDefFoundError
// 	NoClassDefFoundError  vs ClassNotFoundException
//throws vs throw
		
		Pub pub = new Pub();
		
		try {
			pub.enjoy(8);
		} catch (PubException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		divideByZero();
		
	}
	
	public static void divideByZero() throws ArithmeticException
	{
		
		int a=90;
		int r=0;
	
		int c=a/r;
	
		System.out.println(c);
	}


}
