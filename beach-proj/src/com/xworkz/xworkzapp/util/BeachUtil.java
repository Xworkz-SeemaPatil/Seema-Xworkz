package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.Beach.Malpe;

public class BeachUtil {
	public static void main(String[] args) {
		
	Malpe malpe=new Malpe("udupi",5,56);
	System.out.println(malpe.place+" "+malpe.noOfCafe+" "+malpe.noOfBoats);
	malpe.enjoyWithFriends();
	malpe.enjoy(13);
	}

}
