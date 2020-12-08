package com.xworkz.util;

import com.xworkz.jewel.Jewel;

public class JewelUtil {
	
	public static void main(String[] args) {
		Jewel jew=new Jewel("anklets","modern",1500);
		System.out.println(jew.getName()+" "+jew.getDesign()+" "+jew.getPrice());
	}
	

}
