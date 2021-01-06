package com.xworkz.xworkzapp.canteen;

public class CanteenTester {
	public static void main(String[] args) {
		Canteen food= new NorthIndianFood();
		food.serveFood();
		food.fullFillStarving();
		
		Canteen food1=new SouthIndianFood();
		food1.serveFood();
		
		food1.fullFillStarving();
	}

}
