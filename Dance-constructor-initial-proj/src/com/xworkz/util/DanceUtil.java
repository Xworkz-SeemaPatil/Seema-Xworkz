package com.xworkz.util;

import com.xworkz.dance.Dance;

public class DanceUtil {
	public static void main(String[] args) {
		Dance dance=new Dance("free style","chamak chalo");
		System.out.println(dance.getStyle()+" "+dance.getSong());
	}
}
