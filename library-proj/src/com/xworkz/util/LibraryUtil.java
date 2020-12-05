package com.xworkz.util;

import com.xworkz.library.Library;

public class LibraryUtil {
	
	public static void main(String[] args) {
		String[] author= {"chetan Bhagat","SudhaMurthy"};
		
		Library library =new Library("gnana",author,"gov");
		

		System.out.println(library.name +" "+ library.type);
		
		for (String String : author)
		{
		System.out.println(String);
		
		}
		
	}
	
}
