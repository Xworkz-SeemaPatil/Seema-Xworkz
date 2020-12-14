package com.xworkz.xworkzapp.ott;

public class Netflix extends Ott {

	
	public Netflix(String typeOfSubcription, double price, String userName) {
		super(typeOfSubcription, price, userName);
	}
		
		public void timePass(String userName) {
			System.out.println("entering inside timepass method of Netflix");
			super.userName=userName;
			super.watchingWebSeriesAtWeekend();
			System.out.println("Ending timepass method of Netflix");
		}
	
}
