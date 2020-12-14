package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.headphone.HeadPhone;

public class HeadUtil {
		public static void main(String[] args) {
			
			HeadPhone head = new HeadPhone(9000.00,10);
			System.out.println(head.isConnected());
			head.incVol();
			head.onOrOff();
			head.incVol();
			head.decVol();
			head.incVol();
			head.incVol();
			head.decVol();
		
			
		}

	}



