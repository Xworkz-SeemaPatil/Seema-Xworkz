package com.xworkz.xworkzapp.shop;

public class ShopUtil {
	public static void main(String[] args) {
		Shop autoShop=new Automobile();
		autoShop.serve();
		Shop bakeShop=new Bakery();
		bakeShop.serve();
		bakeShop.store();
	}

}
