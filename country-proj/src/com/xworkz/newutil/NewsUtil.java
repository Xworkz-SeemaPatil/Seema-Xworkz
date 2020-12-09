package com.xworkz.newutil;

import com.xworkz.newspaper.TheHindu;

public class NewsUtil {
	public static void main(String[] args) {
	
	//TheHindu hindu = new TheHindu(9,5.0);
	
	//hindu.noOfPages;
	//hindu.price;
	//System.out.println(hindu.noOfPages+" "+hindu.price);
	
	TheHindu hindu = new TheHindu();
	hindu.setNoOfPages(10);
	hindu.setPrice(56.00);
	System.out.println(hindu.getNoOfPages()+" "+hindu.getPrice());
	
	}
}
