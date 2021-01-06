package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.fruit.Fruit;
import com.xworkz.xworkzapp.fruit.WaterMelon;

public class FruitUtil {
	
	public static void main(String[] args) {
		Fruit fruit =new WaterMelon();
		//WaterMelon meleon=(WaterMelon)fruit;
		fruit.type="sweet";
		fruit.price=100;
		fruit.goodForHealth();
		
		System.out.println(fruit.type+" "+fruit.price);
	}

}
