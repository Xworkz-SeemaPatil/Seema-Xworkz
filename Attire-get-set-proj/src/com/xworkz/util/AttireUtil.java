package com.xworkz.util;

import com.xworkz.attire.*;;

public class AttireUtil {
	public static void main(String[] args) {
		
	
	Attires attire=new Attires();
	attire.setSection("women section");
	attire.setColor("red");
	attire.setPrice(599.0);
	
	System.out.println(attire.getSection()+" "+attire.getColor()+" "+attire.getPrice());
	}
}
