package com.xworkz.xworkzapp.headphone;

public class HeadPhone {
	private double price;
	private static String brandName="Boat";
	private int batteryBackup;
	
	public HeadPhone(double price , int batteryBackup) {
		this.price=price;
		this.batteryBackup=batteryBackup;

		System.out.println("arg 1 is " + this.price);
		System.out.println("arg 2 is " + this.batteryBackup);
		this.price=price;
		this.batteryBackup=batteryBackup;
	}
	

	private int maxVol = 10;
	private int minVol = 0;
	private boolean connected;
	private int currentVal;
	
	public void onOrOff() {
		System.out.println("inside onOrOff");
		if(isConnected()==false)
		{
			this.connected=true;
			System.out.println("headphone connected");
		}
		else if(isConnected() == true)
		{
			this.connected = false;
			System.out.println("headphone is not connected");
		}
	}
	

	public void incVol() {
		System.out.println("inside incVol()");
		if(connected == true) {
			if(this.currentVal<this.maxVol) {
				this.currentVal = this.currentVal +1;
				System.out.println("current vol is:" + this.currentVal);
			}
			else {
				System.out.println("gube max volume reached");
			}
		}
	}
	
	public void decVol() {
		System.out.println("inside decVol()");
		if(connected == true) {
			if(this.currentVal>this.minVol) {
				this.currentVal = this.currentVal -1;
				System.out.println("current vol is:" + this.currentVal);
			}
			else {
				System.out.println("gube min volume reached");
			}
		}
	}
	
	
	public boolean isConnected() {
		return connected;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static String getBrandName() {
		return brandName;
	}

	public static void setBrandName(String brandName) {
		HeadPhone.brandName = brandName;
	}

	public int getMaxVol() {
		return maxVol;
	}

	public void setMaxVol(int maxVol) {
		this.maxVol = maxVol;
	}

	public int getMinVal() {
		return minVol;
	}

	public void setMinVal(int minVol) {
		this.minVol = minVol;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}


}
