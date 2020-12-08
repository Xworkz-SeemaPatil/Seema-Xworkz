package com.xworkz.util;

import com.xworkz.church.*;

public class ChurchUtil {
	public static void main(String[] args) {
		Church church =new Church("Kerala","st Mary's Church",45); //constructor initialization
		
		//church.setName("st.Joseph's Church"); //setter initialization
		//church.setAddress("Goa");
		//church.setNoOfFathers(1);
		
		System.out.println(church.getName()+ " "+ church.getAddress()+" "+ church.getNoOfFathers()); 
		
	}

}
