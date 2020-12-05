package com.xworkz.util;
import com.xworkz.musem.*;

public class MusemUtil {
	public static void main(String[] args) {
		
		Musem musem =new Musem(1,"Rising Star","near MG Road",5,"Science Department");
		Musem musem2=new Musem();
		System.out.println(musem2);
		System.out.println(musem.id + " " + musem.name);
		
		
		
	}

}
