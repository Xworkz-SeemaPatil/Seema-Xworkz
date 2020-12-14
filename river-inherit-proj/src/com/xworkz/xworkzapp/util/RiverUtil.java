package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.river.Ganga;
import com.xworkz.xworkzapp.river.Kaveri;
import com.xworkz.xworkzapp.river.Yamuna;

public class RiverUtil {
	public static void main(String[] args) {
		
		Ganga ganga = new Ganga();
		ganga.setBirthPlace("Gangothri");
		ganga.setRiverType("long");
		ganga.setEndPlace("Bay Of Bengal");
		System.out.println(ganga.getBirthPlace()+" "+ganga.getRiverType()+" "+ganga.getEndPlace());
		
		Kaveri kaveri = new Kaveri();
		kaveri.setBirthPlace("Tala Kaveri");
		kaveri.setRiverType("short");
		kaveri.setEndPlace("Arabian Sea");
		System.out.println(kaveri.getBirthPlace()+" "+kaveri.getRiverType()+" "+kaveri.getEndPlace());
		
		Yamuna yamuna=new Yamuna();
		yamuna.setBirthPlace("Himalaya");
		yamuna.setRiverType("long");
		yamuna.setEndPlace("pacific ocean ");
		System.out.println(yamuna.getBirthPlace()+" "+yamuna.getRiverType()+" "+yamuna.getEndPlace());
		
		
		
	}

}
