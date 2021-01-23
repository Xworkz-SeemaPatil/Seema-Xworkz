package com.workz.workzapp;

//custom checked exception
public class PubException extends Exception {

	@Override
	public String getMessage() {
		return "Kids not allowed";

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Kids not allowed";
	}
}
