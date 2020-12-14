package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.speaker.Speaker;

public class SpeakerUtil {
	public static void main(String[] args) {
		
		Speaker speak = new Speaker(2000.00,9);
		System.out.println(speak.isConnected());
		speak.incVol();
		speak.onOrOff();
		speak.incVol();
		speak.decVol();
		speak.incVol();
		speak.incVol();
		speak.decVol();
		speak.decVol();
		speak.decVol();
		
	}

}
