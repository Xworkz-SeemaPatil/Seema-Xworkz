package com.xworkz.util;

import com.xworkz.botel.Botel;

public class BotUtil {
	public static void main(String[] args) {

	Botel bot=new Botel("blue",(float) 5.5,"square",550.00,"butterfly");
	
	System.out.println(bot.getColor()+"  "+bot.getCapacity()+"  " +bot.getShape()+" "+bot.getPrice()+" "+bot.getBrand());
	
	}
}
