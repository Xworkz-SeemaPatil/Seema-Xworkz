package com.workz.workzapp;

public class Pub {
	
	public void  enjoy(int age) throws PubException
	{
		if(age > 18)
		{
			System.out.println("enter into the pub");
		}
		else{
			PubException exception= new PubException();
			throw exception;
		}
	}
	
	
	
	

}
