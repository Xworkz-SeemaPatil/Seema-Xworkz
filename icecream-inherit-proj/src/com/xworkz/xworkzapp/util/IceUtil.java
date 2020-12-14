package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.icecream.ButterScotch;
import com.xworkz.xworkzapp.icecream.Chocolate;

public class IceUtil {
	
	public static void main(String[] args) {
		ButterScotch butter = new ButterScotch();
		butter.setCost(45.00);
		butter.setType("cone");
		System.out.println(butter.getCost()+" "+butter.getType());
		
		Chocolate choco = new Chocolate();
		choco.setCost(50.0);
		choco.setType("cup");
		System.out.println(choco.getCost()+" "+choco.getType());
		
		
	}

}
