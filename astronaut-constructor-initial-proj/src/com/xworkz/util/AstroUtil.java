package com.xworkz.util;

import com.xworkz.astro.Astronaut;

public class AstroUtil {
	public static void main(String[] args) {
		Astronaut astro=new Astronaut("kalpana chawla",12,"Space Shuttle Columbia",30);
		System.out.println(astro.getName()+" "+astro.getId()+" "+astro.getStream()+" "+astro.getNoOfDaysInSpace());
		
	}

}
