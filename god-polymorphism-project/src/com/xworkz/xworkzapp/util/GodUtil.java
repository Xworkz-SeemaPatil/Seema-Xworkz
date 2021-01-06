package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.god.God;
import com.xworkz.xworkzapp.god.Shiva;

public class GodUtil {

	public static void main(String args[] ){
		//upcasting
		God god =new Shiva();
		//downcasting
		Shiva shiva=(Shiva)god;
		god.bless();
		System.out.println(god.address);
		
	}
}
